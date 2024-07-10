package lab_1;
import java.util.Scanner;

public class task5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.print("Enter n for 1 to n sum: ");
        int n=scanner.nextInt();
        int result=0;
        for(int i=0; i<n; i++) {
            result+=i+1;
        }
        System.out.println("Sum of numbers from 1 to " + n + " is: " + result);
        scanner.close();
    }
}