//Q7. Find the factorial of any number using a while loop

import java.util.Scanner;

public class factorial7 {
    
    void factorial(int n)
    {
        int iteration=1;
        int fact=1;
        while(iteration<=n)
        {
            fact*=iteration;
            iteration++;
        }

        System.out.println("factorial of "+n+" is "+fact);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number for factorial:");
        int n=sc.nextInt();

        factorial7 f = new factorial7();
        f.factorial(n);

        sc.close();

    }
}
