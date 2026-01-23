public class patt_4 {
    public static void main(String[] args) {
        
        int[] arr = { 10, 20, 30, 40, 50 };
        System.out.print("Array: ");
        for(int i=0;i<5;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // int s=0;
        // int l=4;

        // while(l>s)
        // {
        //     int temp=arr[s];
        //     arr[s]=arr[l];
        //     arr[l]=temp;
        //     s++;
        //     l--;
        // }
        
        int j=0;
        int arr1[]= new int[5];
        for(int i=4;i>=0;i--)
        {
            arr1[j]=arr[i];
            j++;
        }
        System.out.print("Reverse Array : ");
        for(int i=0;i<5;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        int n=arr.length-1;
        for(int i=0;i<=n/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[n-i];
            arr[n-i]=temp;
        }

        System.out.print("Array after swapping: ");
        for(int i=0;i<5;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
