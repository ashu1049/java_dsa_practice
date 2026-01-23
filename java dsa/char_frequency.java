public class char_frequency {
    public static void main(String[] args) {
        
        String s="aabbc";
        for(char i='a';i<='z';i++)
        {
            int n=0;
            for(int j=0;j<s.length();j++)
            {
                if(i==s.charAt(j))
                {
                    n++;
                }
            }
            if(n>0)
                {
                    System.out.println("Frequency of "+i+" = "+n);
                }
        }
    }
}
