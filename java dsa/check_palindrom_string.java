public class check_palindrom_string {
    public static void main(String[] args) {
        boolean y=true;
        String s= "MADAM";
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
            {
                y=false;
                break;
            }
        }

        if(y==true)
        {
            System.out.println(s+" is Palindrome.");
        }
        else
        System.out.println(s+" is not Palindrome.");
    }
}
