import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;

public class DigitalWatch extends JFrame {
    private JLabel timeLabel;
    private SimpleDateFormat timeFormat;

    public DigitalWatch() {
        setTitle("Digital Watch");
        setSize(1080, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        JLabel background = new JLabel(new ImageIcon("background.jpg"));
        background.setLayout(new BorderLayout());
        add(background); 

        timeLabel = new JLabel("", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Verdana", Font.BOLD, 80));
       
        background.add(timeLabel, BorderLayout.CENTER);  

        timeFormat = new SimpleDateFormat("HH:mm:ss");
        timeFormat.setTimeZone(TimeZone.getDefault());

       
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                timeLabel.setText(timeFormat.format(new Date()));
            }
        }, 0, 1000);

        setVisible(true);
    }

    public static void main(String[] args) {
        new DigitalWatch();
    }
}
