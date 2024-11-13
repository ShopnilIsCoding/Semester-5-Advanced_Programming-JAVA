import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class BlockBreaker extends JPanel implements ActionListener {
    private int ballX;
    private int ballY;
    private int barX;
    private int barY;
    private final int ballDiameter = 20;
    private int ballDeltaX = 2;
    private int ballDeltaY = 3;
    private boolean initialized = false;
    private final Block[][] blocks;  
    private final int rows = 5;     
    private final int cols = 21;    
    private Timer timer;
    private int score = 0;          
    private final int barWidth = 100;
    private final int barHeight = 20;
    private boolean movingLeft = false;
    private boolean movingRight = false;
    private boolean gameOver = false; //variable to track game over state

    public BlockBreaker() {
        timer = new Timer(10, this);
        timer.start();

        blocks = new Block[rows][cols];
        initializeBlocks();  

        // KeyAdapter to track key press and release events
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    movingRight = true;
                } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    movingLeft = true;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    movingRight = false;
                } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    movingLeft = false;
                }
            }
        });
        setFocusable(true);
        requestFocusInWindow();
    }

    private void initializeBlocks() {
        Random rand = new Random();
        int blockStartY = 5;

        for (int i = 0; i < rows; i++) {
            int blockStartX = 5;
            for (int j = 0; j < cols; j++) {
                int width = 50;
                int height = 20;
                Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
                blocks[i][j] = new Block(blockStartX, blockStartY, width, height, color);

                blockStartX += width + 10;
            }
            blockStartY += 30;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (!initialized) {
            ballX = getWidth() / 2 - ballDiameter / 2;
            ballY = getHeight() / 2 - ballDiameter / 2;
            initialized = true;
            barY = getHeight() - 40;
            barX = getWidth() / 2 - barWidth / 2;
        }

        // Draw the blocks
        for (Block[] row : blocks) {
            for (Block block : row) {
                if (block != null) {
                    g.setColor(block.color);
                    g.fillRect(block.x, block.y, block.width, block.height);
                }
            }
        }

        // Draw the paddle (bar)
        g.setColor(Color.RED);
        g.fillRect(barX, barY, barWidth, barHeight);

        // Draw the ball
        g.setColor(Color.GREEN);
        g.fillOval(ballX, ballY, ballDiameter, ballDiameter);

        // Draw the score
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Score: " + score, getWidth()-100, getHeight()-30);

        // Draw Game Over text if gameOver is true
        if (gameOver) {
            g.setColor(Color.RED);
            g.setFont(new Font("Arial", Font.BOLD, 40));
            g.drawString("Game Over", getWidth() / 2 - 100, getHeight() / 2);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (gameOver) {
            timer.stop();
            return; // Stop updating if the game is over
        }

        // Ball movement
        ballX += ballDeltaX;
        ballY += ballDeltaY;

        // Paddle movement based on flags
        if (movingRight && barX + barWidth < getWidth()) {
            barX += 5;  // Increase the value for faster movement
        }
        if (movingLeft && barX > 0) {
            barX -= 5;
        }

        // Bounce off edges
        if (ballX <= 0 || ballX + ballDiameter >= getWidth()) {
            ballDeltaX = -ballDeltaX;
        }
        if (ballY <= 0) {
            ballDeltaY = -ballDeltaY;
        }

        // Check if the ball hits the bottom (game over condition)
        if (ballY + ballDiameter >= getHeight()) {
            gameOver = true; // Set game over to true
            repaint();
            return;
        }

        // Check for collisions with blocks
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Block block = blocks[i][j];
                if (block != null && ballX < block.x + block.width && ballX + ballDiameter > block.x &&
                        ballY < block.y + block.height && ballY + ballDiameter > block.y) {

                    blocks[i][j] = null;
                    ballDeltaY = -ballDeltaY;
                    score += 10;
                    System.out.println("Score: " + score);
                    break;
                }
            }
        }

        // Check for collision with the paddle
        if (ballY + ballDiameter >= barY && ballX + ballDiameter > barX && ballX < barX + barWidth) {
            ballDeltaY = -ballDeltaY;
        }

        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Block Breaker");
        frame.setSize(1275, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BlockBreaker blockbreaker = new BlockBreaker();
        frame.add(blockbreaker);
        frame.setVisible(true);
    }

    // Inner class to represent a block
    private static class Block {
        int x, y, width, height;
        Color color;

        Block(int x, int y, int width, int height, Color color) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
            this.color = color;
        }
    }
}
