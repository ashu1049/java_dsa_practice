public class linear_search {
    public static void main(String[] args) {
        
        int[] arr={4,6,8,6,4,7,9,6,5,6,7,7,4,8,12,7,20};
        int target=7;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                count++;
            }
        }
        
        System.out.println("Element "+target+" is present "+count+" in array.");
    }
}
