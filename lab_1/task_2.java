package lab_1;

import java.util.Scanner;

public class task_2 {
    
    public static void main(String[] args) {
        
        while (true) {
            System.out.println("please select a option");
            System.out.println("1. addition");
            System.out.println("2. subtraction");
            System.out.println("3. multiplication");
            System.out.println("4. division");
            System.out.println("5. Exit");
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();
            
                System.out.print("input two values: ");
            
            float a=scanner.nextFloat();
            float b=scanner.nextFloat();
            float result;
            if(userInput ==1)
            {
                result = a+b;
                System.out.println("addition of "+a+"and"+b + "is ="+ result);
            }
            else if(userInput ==2)
            {
                result = a-b;
                System.out.println("subtraction of "+a+"and"+b + "is ="+ result);
            }
            else if(userInput ==3)
            {
                result=a*b;
                System.out.println("multiplication of "+a+"and"+b + "is ="+ result);
            }
            else if(userInput ==4)
            {
                result=a/b;
                System.out.println("division of "+a+"and"+b + "is ="+ result);
            }
            else if(userInput ==5)
            {
                System.out.println("Exiting...");
                scanner.close();
                break;
                
            }
        }
    }
}