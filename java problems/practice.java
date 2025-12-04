// hot mant sets of 3 in array have {1st + 3rd = 2nd} element.

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        int n= sc.nextInt();
        
        int arr[]= new int[n];
        int count=0;

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n-2;i++)
        {
            if(arr[i] + arr[i+2] == arr[i+1])
                count++;
        }
        System.out.println("Total set are: "+count);
        sc.close();
    }
}
