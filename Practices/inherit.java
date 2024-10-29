package Practices;

class grandfather {
    static final int sage=20;
    String gname;
    int gage;
    grandfather(String gname, int gage)
    {
        this.gname = gname;
        this.gage = gage;
      
    }
    void display()
    {
        System.out.println("Grandfather's Name: " + gname + ", Age: " + gage);
    }
}

class father extends grandfather
{
    String fname;
    int fage;
    
    father(String fname,String gname,int gage, int fage)
    {
        super(gname, gage);
        
        this.fname = fname;
        this.fage = fage;
       
    }
   @Override
    void display() {
        super.display();
        System.out.println("Father's Name: " + fname + ", Age: " + fage);
    }
}

class son extends father
{
    String sname;
    
    
    son(String sname, String fname, String gname)
    {
        super(fname, gname, sage+45, sage+22);
        
        this.sname = sname;
        display();
    }
    @Override
    void display() {
        super.display();
        System.out.println("Son's Name: " + sname + ", Age: " + sage);
    }
}

public class inherit {
    public static void main(String[] args) {
       son s= new son("rahim", "mahim", "karim");
       
    }
    
}



