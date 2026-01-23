public class chech_sorted {
    public static void main(String[] args) {
        int[] arr1 = { 10, 20, 30, 40, 50 };

        boolean y=true;
        for(int i=0;i<arr1.length-1;i++)
        {
            if(arr1[i+1]<arr1[i])
            {
                y=false;
                break;
            }
        }

        if(y==false)
        System.out.println("array 1 is not sorted");
        else
        System.out.println("array 1 is  sorted");

        int[] arr2 = { 10, 300, 70, 40, 90 };
        boolean x=true;
        for(int i=0;i<arr2.length-1;i++)
        {
            if(arr2[i+1]<arr2[i])
            {
                x=false;
                break;
            }
        }

        if(x==false)
        System.out.println("array 2 is not sorted");
        else
            System.out.println("array 2 is not sorted");
    }
}
