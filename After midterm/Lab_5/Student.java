
import java.util.ArrayList;

public class Student
{
    String name;
    int age;
    char grade;    

    Student(String name, int age, char grade)
    {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public char getGrade()
    {
        return grade;
    }
    public String toString()
    {
        return "Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }
}

class StudentManagementSystem
{
    ArrayList<Student> students = new ArrayList<>();
    
    public void addStudent(Student student)
    {
        students.add(student);
    }
    
    public void displayAllStudents()
    {
        for(Student student : students)
        {
            System.out.println(student.toString());
        }
    }
    
    public void removeStudentByName(String name)
    {
        for(int i = 0; i < students.size(); i++)
        {
            if(students.get(i).getName().equals(name))
            {
                students.remove(i);
                break;
            }
        }
    }

    public void removeStudentByIndex(int i)
    {
        students.remove(i);
    }

    
}