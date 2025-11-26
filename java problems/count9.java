//Q9. Count digits in an integer using loop

import java.util.Scanner;

public class count9 {
    int sum=0;
    void count(int n)
    {
        while(n!=0)
        {
            sum+=n%10;
            n/=10;
        }

        System.out.println("sum of digits in number is: "+sum);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n= sc.nextInt();

        count9 r1 = new count9();
        r1.count(n);

        sc.close();
    }
}
