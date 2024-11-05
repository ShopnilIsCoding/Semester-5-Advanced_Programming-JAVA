import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}

public class GradeCalculator {
    public static void calculateGrade(int mark1, int mark2, int mark3) throws InvalidGradeException {
        if (mark1 < 0 || mark1 > 100 || mark2 < 0 || mark2 > 100 || mark3 < 0 || mark3 > 100) {
            throw new InvalidGradeException("Marks should be between 0 and 100.");
        }
        
        int average = (mark1 + mark2 + mark3) / 3;
        System.out.println("Average Grade: " + average);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter marks for subject 1: ");
            int mark1 = scanner.nextInt();
            System.out.print("Enter marks for subject 2: ");
            int mark2 = scanner.nextInt();
            System.out.print("Enter marks for subject 3: ");
            int mark3 = scanner.nextInt();
            
            calculateGrade(mark1, mark2, mark3);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter numeric values.");
        } catch (InvalidGradeException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
