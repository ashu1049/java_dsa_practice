public class linear2 {
    public static int found(int[] arr, int target)
    {
        int flag=-1;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==target)
            {
                flag=i;
            }
        }

        return flag;
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        int target=5;

        int result=found(arr, target);

        if(result!=-1)
        {
            System.out.println("Target fount at index "+result+".");
        }
        else
        {
            System.out.println("Target not fount. ");
        }
    }
}
