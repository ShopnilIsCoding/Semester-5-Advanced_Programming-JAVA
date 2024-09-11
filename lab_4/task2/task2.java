package task2;
import java.lang.Math;
interface Polygon {
    void printArea();    
    void printPerimeter(); 
}

class triangle implements Polygon
{
    private double a;
    private double b;
    private double c;
    
    public triangle(double a, double b ,double c) {
        this.a = a;
        this.b = b;
        this.c=c;
    }

    public void printPerimeter()
    {
        double perimeter = a+b+c;
        System.out.println("Perimeter of the triangle: " + perimeter);
    }

    public void printArea()
    {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of the triangle: " + area);
    }
}


public class task2 {
    public static void main(String[] args) {
        Polygon t1 = new triangle(3, 4, 5);
        t1.printPerimeter();
        t1.printArea();
    }
    
}
