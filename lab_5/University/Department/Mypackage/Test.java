package lab_5.University.Department.Mypackage;
import lab_5.University.WelcomeMessage;
import lab_5.University.Department.Goal;
import lab_5.University.Department.Staff;

public class Test {

    public static void main(String[] args) {
        WelcomeMessage welcomeMessage = new WelcomeMessage();
        welcomeMessage.showmsg();
        
        Goal goal = new Goal();
        goal.Goal();
        
        Staff staff = new Staff();
        staff.addStaff();
        staff.removeStaff();
    }
    
}
