//Q8. Write a program to print the Fibonacci series of N terms
import java.util.Scanner;

public class fibbonacci8 {
    
    void display(int n)
    {
        int a=0;
        int b=1;
        int c;
        System.out.print("0, 1");
        for(int i=2;i<n;i++)
        {
            
            c=a+b;
            a=b;
            b=c;
            System.out.print(", "+c);
        }
    }

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("How many numbers in fibbonace series do you want: ");
        int n=sc.nextInt();
        fibbonacci8 f1= new fibbonacci8();
        if(n==0)
        System.out.print("No elements.");
        else if(n==1)
        System.out.print("0");
        else if(n==2)
        System.out.print("0, 1");
        else if(n>2)
        f1.display(n);
       
        sc.close();
    }
}
