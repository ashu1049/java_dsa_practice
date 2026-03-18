// Given: An unsorted array of integer numbers.
// Goal: Determine the length of the longest consecutive elements sequence.
// Example 1: Input: [100, 4, 200, 1, 3, 2] Output: 4 Explanation: The sequence is [1,2,3,4].
// Example 2: Input: [1, 0, 1, 2] Output: 3 Explanation: The sequence is [0,1,2].
// import java.util.Set;
// import java.util.HashSet;

import java.util.Arrays;

public class raja2 {
    public static int longestConsecutive(int[] arr)
    {
        Arrays.sort(arr);
        int count=1;
        int max=0;
        int num=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==num+1)
            {
                count++;
                num=arr[i];
            }
            else if(arr[i]- num >1) 
            {
                max=Math.max(count, max);
                count=1;
                num=arr[i];
            }

            max=Math.max(count, max);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] array1={100, 4, 200, 1, 3, 2};
        int[] array2={1, 0, 1, 2};

        System.out.println(longestConsecutive(array1));
        System.out.println(longestConsecutive(array2));

    }
}
