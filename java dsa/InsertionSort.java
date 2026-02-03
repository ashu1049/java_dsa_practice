public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={5,1,6,2,4,3};
        int n=arr.length;
        int temp;
        int j;
        for(int i=1;i<n;i++)
        {
            temp=arr[i];
            j=i;
            while(j>0 && arr[j-1]>temp)
            {
                arr[j]=arr[j-1];
                j=j-1;
            }
            arr[j]=temp;
        }
        for(int i:arr)
        {
            System.out.print(i+ ", ");
        }
    }
}
