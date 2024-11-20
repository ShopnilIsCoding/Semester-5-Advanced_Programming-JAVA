import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ExceptionHandlingLabTasks {

    public static void main(String[] args) {
       
        handleArithmeticException();
        handleArrayIndexOutOfBoundsException();
        handleClassCastException();
        handleNullPointerException();
        handleNumberFormatException();
      
        handleNoSuchFieldException();
        handleNoSuchMethodException();
    }
   
    public static void handleArithmeticException() {
        try {
            int result = 10 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }
   
    public static void handleArrayIndexOutOfBoundsException() {
        try {
            int[] array = new int[5];
            int value = array[10]; 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

   
    public static void handleClassCastException() {
        try {
            Object str = "Hello";
            Integer number = (Integer) str; 
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
    }

  
    public static void handleNullPointerException() {
        try {
            String str = null;
            int length = str.length(); 
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

   
    public static void handleNumberFormatException() {
        try {
            int num = Integer.parseInt("abc"); 
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
    }

   
    public static void handleNoSuchFieldException() {
        try {
            Class<?> clazz = SampleClass.class;
            Field field = clazz.getField("nonExistentField"); 
        } catch (NoSuchFieldException e) {
            System.out.println("Caught NoSuchFieldException: " + e.getMessage());
        }
    }

  
    public static void handleNoSuchMethodException() {
        try {
            Class<?> clazz = SampleClass.class;
            Method method = clazz.getMethod("nonExistentMethod"); 
        } catch (NoSuchMethodException e) {
            System.out.println("Caught NoSuchMethodException: " + e.getMessage());
        }
    }
}


class SampleClass {
    // public void nonExistentMethod()
    // {
    //     //empty

    // };
    
}