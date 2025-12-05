// Q26. Create a utility class using static methods
// Methods:
// •	square(int)
// •	cube(int)

import java.util.Scanner;

public class utility_calss
{
    
    static void square(int n)
    {
        int square= n*n;
        System.out.println("Square of "+n+" is:"+square);
    }

    static void cube(int n)
    {
        int cube= n*n*n;
        System.out.println("cube of "+n+" is:"+cube);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to get a aquare and cube of that number: ");
        int n = sc.nextInt();
        utility_calss.square(n);
        utility_calss.cube(n);
        sc.close();
    }
}
