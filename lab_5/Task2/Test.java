package lab_5.Task2;
import java.time.LocalDateTime;

class Computer {

    interface USB {
        void connect();
        void disconnect();
    }
}

class Keyboard implements Computer.USB {
    public void connect() {
        System.out.println("Keyboard connected at "+LocalDateTime.now());
    }

    public void disconnect() {
        System.out.println("Keyboard disconnected at " + LocalDateTime.now());
    }
}

class Mouse implements Computer.USB {
    public void connect() {
        System.out.println("Mouse connected at "+LocalDateTime.now());
    }

    public void disconnect() {
        System.out.println("Mouse disconnected at " + LocalDateTime.now());
    }
}

public class Test {
    public static void main(String[] args) {
        Computer.USB keyboard = new Keyboard();
        keyboard.connect();
        keyboard.disconnect();
        
        Computer.USB mouse = new Mouse();
        mouse.connect();
        mouse.disconnect();
    }
    
}
