public class bubble_sort {
    public static void main(String[] args) {
        
        int[] arr= {1,7,6,4,2};
        

        for(int i=0;i<arr.length-1;i++)
        {
            boolean flag=true;
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    flag=false;
                }
            }
            if(flag)
            {
                break;
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+", ");
        }
    }
}
