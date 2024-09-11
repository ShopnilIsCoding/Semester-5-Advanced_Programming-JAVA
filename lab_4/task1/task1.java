package task1;

/**
 * task1
 */
interface Polygon {
    void printArea();    
    void printPerimeter(); 
}

class Rectangle implements Polygon {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public void printArea() {
        double area = length * width;
        System.out.println("Area of the rectangle: " + area);
    }
    
    public void printPerimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}

public class task1{

    public static void main(String[] args) {
         Polygon r =new Rectangle(7,5);
         r.printArea();
         r.printPerimeter();
    }

}