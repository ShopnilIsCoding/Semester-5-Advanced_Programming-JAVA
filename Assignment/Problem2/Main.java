package Problem2;

class Animal {

    public void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {

    @Override
    public void speak() {
        System.out.println("Dog barks");
    }

    public void speak(int volume) {
        System.out.println("Dog barks at volume " + volume);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();  // Now declared as Dog, so the overloaded method can be called
        myDog.speak(10);        // Calls Dog's overloaded method
    }
}
