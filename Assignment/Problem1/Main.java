package Problem1;

class Calculator {

    private int intResult;
    private double doubleResult;

    public int add(int a, int b) {
        this.intResult = a + b;
        return intResult;
    }

    public double add(double a, double b) {
        this.doubleResult = a + b;
        return doubleResult;
    }

    public int getIntResult() {
        return intResult;
    }

    public double getDoubleResult() {
        return doubleResult;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of integers: " + calc.add(10, 20));
        System.out.println("Sum of doubles: " + calc.add(10.5, 20.3));
    }
}

