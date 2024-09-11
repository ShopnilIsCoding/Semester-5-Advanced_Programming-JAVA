package task2;
import java.lang.Math;
interface Polygon {
    void printArea(double a, double b ,double c);    
    void printPerimeter(double a, double b ,double c); 
}

class triangle implements Polygon
{
    public void printPerimeter(double a, double b ,double c)
    {
        double perimeter = a+b+c;
        System.out.println("Perimeter of the triangle: " + perimeter);
    }

    public void printArea(double a, double b ,double c)
    {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of the triangle: " + area);
    }
}


public class task2 {
    public static void main(String[] args) {
        Polygon t1 = new triangle();
        t1.printPerimeter(3,4,5);
        t1.printArea(3,4,5);
    }
    
}
