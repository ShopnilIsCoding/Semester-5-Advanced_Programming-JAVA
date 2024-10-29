package Practices;

interface instruments
{
    void play();
    int speed=50;
}

class a implements instruments
{
    @Override
    public void play()
    {
        System.out.println("I'm playing an instrument");
    }
}
class b implements instruments
{
    @Override
    public void play()
    {
        System.out.println("I'm playing two instrument");
    }
}



public class learn {
    public static void main(String[] args) {
        instruments a =new a();
        a.play();
    }
    
}
