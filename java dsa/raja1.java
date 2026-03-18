// Given: A non-empty array of integer numbers, every element appears twice except for one.
// Goal: Determine the element that appears only once.
// (DO NOT use any inbuilt functionalities like Collections or related things from any other languages)
// Example 1: Input: [2,2,1] Output: 1 Explanation: Each element appears twice except for 1.
// Example 2: Input: [4,1,2,1,2] Output: 4 Explanation: Each element appears twice except for 4.

public class raja1 {

    public static int findUnique(int[] arr)
    {
        int num=0;
        for(int i:arr)
        {
            num=num^i;
        }
        return num;
    }
    public static void main(String[] args) {
        int[] array1={2,2,1};
        int[] array2={4,1,2,1,2};

        System.out.println(findUnique(array1));
        System.out.println(findUnique(array2));
    }
}
