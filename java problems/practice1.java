// Given a string containing '*' and '#'
// Return the difference: count(*) - count(#)
// Positive if '*' > '#'
// Negative if '#' > '*'
// 0 if both are equal

import java.util.Scanner;

public class practice1 {
    public static int count(String s) {
        int c = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                c++;
            } else if(ch=='#'){
                c--;
            }
            else{
                System.out.println("Invalid Character in String...");
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String (String can only cantain '*' & '#'):");
        String str = sc.next();

        int ans = count(str);
        System.out.println("Answer is:" + ans);
        sc.close();

    }
}