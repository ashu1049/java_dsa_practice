//Q10. Reverse a number using loop (1234 → 4321)

import java.util.Scanner;

public class reverse10 {
    int rev;
    void reverse(int n)
    {
        int no=n;
        while(n!=0)
        {
            
            int dig= n%10;
            rev= rev*10+dig;
            n=n/10;
        }
        System.out.println("number "+no+" in reverse is "+rev);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n= sc.nextInt();

        reverse10 r1 = new reverse10();
        r1.reverse(n);

        sc.close();
    }
}
