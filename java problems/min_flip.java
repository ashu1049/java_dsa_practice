public class min_flip {

    public static int flip(int start, int goal)
    {
        int c=0;
        int r=0;
        int n=start^goal;

        while(n!=0)
        {
            r=n%2;
            if(r==1) c++;
            n/=2;
        }
        return c;
    }
    public static void main(String[] args) {
        
        int start=10;
        int goal=7;

        int result=flip(start, goal);
        System.out.println(result);
    }
}
