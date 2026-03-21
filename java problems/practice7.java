//15 march 2024 shift 1 tcs nqt

import java.util.Scanner;

public class practice7 {

    public static int sum(int i, int j)
    {
        int sum=0;
        for(int k=i;k<=j;k++)
        {
            sum+=k;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of i:");
        int i=sc.nextInt();
        System.out.println("Enter the value of j:");
        int j= sc.nextInt();

        System.out.println("Sum of numbers in Inclusice Range of i and j is: "+sum(i, j));

        sc.close();
    }
}
