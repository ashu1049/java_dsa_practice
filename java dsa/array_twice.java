import java.util.Scanner;
public class array_twice {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arr: ");
        int n=sc.nextInt();

        System.out.print("Enter the elements of arr: ");

        int arr1[]= new int[n];

        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }

        int arr2[]= new int[2*n];

        for(int i=0;i<2*n;i++)
        {
            arr2[i]=arr1[i%n];
        }

        for(int i=0;i<2*n;i++)
        {
            System.out.print(arr2[i]);
        }
        

        sc.close();
    }
}
