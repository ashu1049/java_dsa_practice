public class recursiondemo {
    static void sum(int x)
    {
        if(x>0)
        {
           sum(x-1);
           System.out.println(x);
        }
        
    }
    public static void main(String[] args) {
        int x=3;
        sum(x);
    }
}
