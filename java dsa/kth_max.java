import java.util.Arrays;
public class kth_max {
    public static void main(String[] args) {
        int[] arr={1,4,7,3,8,6,9,5};

        Arrays.sort(arr);
        int k=3;
        int kth_max=arr[arr.length-k];

        System.out.println("Max element in array is: "+kth_max);
    }
}
