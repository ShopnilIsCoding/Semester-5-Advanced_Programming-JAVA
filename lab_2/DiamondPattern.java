import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Asking the user to enter the number of rows for the diamond
        System.out.print("Enter number of rows: ");
        int n = scanner.nextInt();
        
        // Upper half of the diamond
        for (int i = 1; i <= n; i++) {
            // Printing spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Printing spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
