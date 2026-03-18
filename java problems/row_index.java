public class row_index {

    public static int r_index(int[][] parking)
    {
        int index=-1;
        int max_full=0;
        for(int i=0;i<parking.length;i++)
        {
            int count=0;
            for(int j=0;j<parking[0].length;j++)
            {
                if(parking[i][j]==1)
                {
                    count++;
                }
            }
            if(count>max_full)
            {
                index=i+1;
                max_full=count;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[][] parking = {
                { 0, 1, 0},
                { 1, 1, 0},
                { 1, 1, 1 }
            };

        int result=r_index(parking);
        System.out.println("Answer: "+ result);
    }
}
