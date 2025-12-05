//Q11. Check whether a number is prime or not

import java.util.Scanner;

public class checkprime11 {
    
    boolean prime=true;

    void isprime(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                prime= false;
                break;
            }
        }
        if(prime)
            System.out.println("The number"+n+" is prime.");
        else
            System.out.println("The number"+n+" is not prime.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check if its prime or not: ");
        int n= sc.nextInt();

        checkprime11 c1= new checkprime11();
        c1.isprime(n);
        
        sc.close();
    }
}
