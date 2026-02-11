public class percentage {
    public static double percent(int m1,int m2,int m3,int m4)
    {
        int total_marks=m1+m2+m3+m4;
        return total_marks/4.0;
    }
    public static void main(String[] args) {
        double ans=percent(76,98,56,87);
        System.out.println("Percentage: "+ans);
    }
}
