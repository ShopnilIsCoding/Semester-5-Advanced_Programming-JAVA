import java.util.Scanner;

public class Learn {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int i = 0;
        while (i < 10) {
            System.out.println("Number: " + i);
            i++;
        }
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int userInput = scanner.nextInt();
        int[] array = new int[userInput];

        for(int j=0 ; j < userInput ; j++) {
            System.out.print("Enter number " + (j+1) + ": ");
            int num = scanner.nextInt();
            // System.out.println("The square of " + num + " is: " + (num * num));
            array[j] = num;;

    }
    for(int j=0 ; j < userInput ; j++) {
        System.out.print(array[j]+" ");
    }
    
}
}