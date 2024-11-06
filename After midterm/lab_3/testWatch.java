import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Timer;

public class testWatch extends JFrame {

    private JLabel timeLabel;
    private SimpleDateFormat SimpleDateFormat;

    public testWatch()
    {
        setTitle("Test Watch");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel bg=new JLabel(new ImageIcon("background.png"));
        bg.setLayout(new BorderLayout());
        add(bg);

        timeLabel =new JLabel("Neha",SwingConstants.CENTER);
        timeLabel.setFont(new Font("Verdana", Font.BOLD, 80));
        bg.add(timeLabel, BorderLayout.CENTER);

        SimpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat.setTimeZone(TimeZone.getDefault());
        Timer timer=new Timer();
        timer.schedule(new TimerTask()
        {
            public void run()
            {
               timeLabel.setText(SimpleDateFormat.format( new Date())); 
            }
        }, 0, 1000);
        setVisible(true);
    }

    public static void main(String[] args) {
        new testWatch();
    }
    
}
