// Given a string containing '*' and '#'
// Return the difference: count(*) - count(#)
// Positive if '*' > '#'
// Negative if '#' > '*'
// 0 if both are equal

//import java.util.Scanner;

public class practice2 {
    public static int count(int[] arr) {
        if (arr.length == 0) return 0;
        int c = 1;
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                c++;
                max=arr[i];
            }
        }
        return c;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of array:");
        // int n = sc.nextInt();
        // int[] arr= new int[n];
        //for(int i=0;i<arr.length;i++)
        // {
        //     arr[i]=sc.nextInt();
        // }
        int[] arr={3, 3, 3, 3};
        int ans = count(arr);


        System.out.println("Answer is:" + ans);
        //sc.close();

    }
}