package lab_1;
import java.util.Scanner;
public class task_3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int userInput = scanner.nextInt();
        int[] array = new int[userInput];
        for(int j=0 ; j < userInput ; j++) {
            System.out.print("Enter number " + (j+1) + ": ");
            int num = scanner.nextInt();
            array[j] = num;;

    }
        int max=array[0],min=array[0];

        for (int i = 0; i < array.length; i++) {
            
            if (array[i]>max) {
                max=array[i];;
            }
            if(array[i]<min)
            {
                min=array[i];
            }
        }
        System.out.println("The smallest index is: " + min);
        System.out.println("The largest index is: " + max);

    }
}