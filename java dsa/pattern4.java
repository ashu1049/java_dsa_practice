public class pattern4 {
    public static void main(String[] args) {
        int n=4, m=4;

        for (int i=0;i<n;i++)
        {
            for (int j=0;j<=m-i-1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
