public class Height_problem {
    public static boolean equal_or_not(int gh, int sh, int gv, int sv)
    {
        while(sh<=gh)
        {
            gh=gh+gv;
            sh=sh+sv;

            if(gh==sh) return true;

        }

        return false;
    }
    public static void main(String[] args) {
        boolean ans=equal_or_not(10,5,1,2);

        System.out.println(ans);
    }
}
// gh=gian height
// sh=sunio height
// gv=speed of gian big light 
// sv=speed of sunio big light