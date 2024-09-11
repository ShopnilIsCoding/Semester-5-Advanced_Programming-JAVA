package task4;


class holiday
{
    private String name;
    private int day;
    private String month;
    
    public holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }
    public String getName()
    {
        return this.name;
    }
    public int getDay()
    {
        return this.day;
    }
    public String getMonth()
    {
        return this.month;
    }

}

public class task4 {

    public static void main(String[] args) {
        holiday christmas = new holiday("Christmas", 25, "December");
        System.out.println("Christmas: " + christmas.getName() + ", " + christmas.getDay() + " " + christmas.getMonth());
    }

}
