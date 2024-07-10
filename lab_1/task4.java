package lab_1;
public class task4 {
    
    public static void main(String[] args) {
        for(int i=0; i<8; i++)
        {
            for(int j=0 ; j<8; j++)
            {
                if ((i+j)%2==0) {
                    System.out.print("1 ");
                    
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.err.println();
        }
    }
}