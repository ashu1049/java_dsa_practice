public class binary_search1
{
    public static void main(String[] args) {
        
        int[] arr={7,8,12,14,16,20,22};
        int target=16;
        int l=0;
        int h=arr.length-1;
        int flag=-1;

        while(l<=h)
        {
            int m=l+(h-l)/2;
            if(arr[m]==target)
            {
                flag=m;
                break;
            }
            else if(arr[m]>target)
            {
                h=m-1;
            }
            else if(arr[m]<target)
            {
                l=m+1;
            }
        }
        if(flag!=-1)
        {
            System.out.println("Target found at index "+flag);
        }
        else
        {
            System.out.println("Target not found. ");
        }
    }
}