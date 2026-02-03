public class binary_3 {
    public static void main(String[] args) {
    
        char[] arr={'c', 'f', 'j'};
        char target='a';
        
        for(char ch: arr)
        {
            if(target==ch)
            {
                System.out.println("Target found.");
                break;
            }
            else if(ch>target)
            {
                System.out.println("Target not fount but next greater character is: "+ch);
                break;  
            }
        }

        
    }
}
