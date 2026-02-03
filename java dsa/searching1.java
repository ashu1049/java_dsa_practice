public class searching1 {
    public static void linear(int[] arr, int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                System.out.println("Linear search: Target found at index "+i);
                break;
            }
        }
    }

    public static void binary(int[] arr, int target)
    {
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

        System.out.println("Binary search: Target found at index "+flag);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int target=5;
        linear(arr, target);
        binary(arr, target);
    }
}
