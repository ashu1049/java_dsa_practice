// given sorted array
// return index if target is fount 
// if not fount return the index where it can be inserted

public class binary_ques {

    public static void linear(int[] arr, int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                System.out.println("Linear search: Target found at index "+i);
                break;
            }
            else if(arr[i]> target)
            {
                System.out.println("Target is not present in array, but can be inserted at index "+i);
                break;
            }
        }
    }

    public static void binary(int[] arr, int target)
    {
        int l=0;
        int h=arr.length-1;

        while(l<=h)
        {
            int m=l+(h-l)/2;
            
            if(arr[m]==target)
            {
                System.out.println("binary search: Target found at index "+l);
                break;
            }

            else if(arr[m]<target)
            {
                if(arr[m+1]>target)
                {
                    m=m+1;
                    System.out.println("Target is not present in array, but can be inserted at index "+m);
                    break;
                }
                else
                {
                    l=m+1;
                }    
            }
            
            else if(arr[m]>target)
            {
                if(arr[m-1]<target)
                {
                    System.out.println("Target is not present in array, but can be inserted at index "+m);
                    break;
                }
                else
                {
                    h=m-1;
                }    
            }
            
        }

    }
    public static void main(String[] args) {
        int[] arr = {3, 7, 11, 15, 18, 22, 27, 31, 36, 40,45, 49, 54, 58, 63, 67, 72, 76, 81, 85,90, 94, 99, 103, 108, 112, 117, 121, 126, 130};
        int target=76;

        // int[] arr= {2,4,6,8,10,12,14,16};
        // int target=13; 

        linear(arr, target);
        binary(arr, target);
    }
}
