public class array_sort1 {
    public static void main(String[] args) {
        int[] arr={7,8,6,4,12};
        int k=5;
        
        for(int i=0;i<k;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[i])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
           
        }
        System.out.println(k+"th Max element in array is: "+arr[k-1]);
    }
}
