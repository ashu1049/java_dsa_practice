public class patt_1 {
    public static void main(String[] args) {
       
        int n=3;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<n;k++)
                {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
