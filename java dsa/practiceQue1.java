import java.util.Arrays;

public class practiceQue1 {
    public static void main(String[] args) {
        int[] nums={2,7,5,7,4,6,4,8,10,13,7};
        int k=2;
        // int count=101;
        // for(int i=0;i<arr.length;i++)
        // {
        //     int val=arr[i]*k;
        //     int c=0;
        //     for(int j=0;j<arr.length;j++)
        //     {
        //         if(i==j) continue;

        //         if(arr[j]<val)
        //         {
        //             c++;
        //         }
        //     }
        //     count=Math.min(count,c);
        // }

        // System.out.println("Ans: "+count);

    Arrays.sort(nums);
    int n = nums.length;
    int left = 0;
    int Window = 1;

    for (int right = 0; right < n; right++) {

      while ((long) nums[right] > (long) nums[left] * k) {
        left++;
      }

      Window = Math.max(Window, right - left + 1);
    }

    System.out.println(n-Window);

    }
}
//