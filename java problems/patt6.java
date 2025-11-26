// Q6. Print the following pattern
// *
// **
// ***
// ****


public class patt6 {
    
    void pattern()
    {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        patt6 p= new patt6();
        p.pattern();
    }
}
