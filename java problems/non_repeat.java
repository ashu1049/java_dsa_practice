public class non_repeat
{
    public static void main(String[] args) {
        int arr[]={4,1,2,1,2};

        int x=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            x=x^arr[i];
        }

        System.out.println(x);
    }
}