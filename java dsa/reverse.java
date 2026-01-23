public class reverse {
    public static void main(String[] args) {
        
        String s="hello world!";
        String r="";
        StringBuilder sb= new StringBuilder();

        for(int i=s.length()-1;i>=0;i--)
        {
            sb.append(s.charAt(i));
        }

        for(int i=s.length()-1;i>=0;i--)
        {
            r+=s.charAt(i);
        }
        System.out.println("Original String: "+s);
        System.out.println("Reverse String: "+r);
        System.out.println("Reverse String using StrinBuilder: "+sb);

    }
}
