//4,5,6,7,1,2,3 target=0

public class binary4 {
    public static void main(String[] args) {
        int[] arr={6,7,0,1,2,4,5};
        int target=0;
        int l=0;
        int r=arr.length-1;
        int mid=-1;

        while(l<=r)
        {
            mid=l+(r-l)/2;

            if(arr[mid]==target)
            {
                System.out.println("index: "+mid);
                break;
            }

            if (arr[l] <= arr[mid])
            {
                if (target >= arr[l] && target < arr[mid])
                {
                    r = mid - 1;
                } 
                else 
                {
                    l = mid + 1;
                }
            }
            
            else 
            {
                if (target > arr[mid] && target <= arr[r]) 
                {
                    l = mid + 1;
                }
                else 
                {
                    r = mid - 1;
                }
            }
  
        }

        //System.out.println("index: "+mid);
    }
}
