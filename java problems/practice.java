import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        int n= sc.nextInt();
        
        int arr[]= new int[8];
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
        System.out.println(count);
        sc.close();
    }
}
