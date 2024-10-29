package Practices;


class Person {
   
    protected int age;
    public void showType() {
        System.out.println("This is a person");
    }
    public void setAge(int age) {
        this.age = age;
    }
}

class Student extends Person {
   
    @Override
    public void showType() {
        System.out.println("This is a student");
    }
}

class Teacher extends Person {
   
    @Override
    public void showType() {
        System.out.println("This is a teacher");
    }
}

public class Test {
    public static void main(String[] args) {
        
        Student student = new Student();
        student.showType();
        student.setAge(25);
        System.out.println("Student age: " + student.age); 
    }

}
