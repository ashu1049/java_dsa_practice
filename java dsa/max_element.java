public class max_element {
    public static void main(String[] args) {
        
        int[] arr={1,4,7,3,8,6,9,5};

        int max=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }

        System.out.println("Max element in array is: "+max);
    }
}
