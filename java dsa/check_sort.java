public class check_sort {

    public static boolean issort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;)
            {
                if(arr[j]>arr[i])
                return false;
                break;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {50,40,30,20,10};

        boolean y= issort(arr);
        if(y)
            System.out.println("Array is sorted");
        else
            System.out.println("Array is not sorted");

    }
}
