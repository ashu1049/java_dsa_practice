// Q5.
// Given: A pattern string and a string 'str'.
// Goal: Check if 'str' follows the same pattern.
// Each character maps to a unique word and vice versa.
// Example 1: pattern = 'abba', str = 'dog cat cat dog' ® true
// Example 2: pattern = 'abba', str = 'dog cat cat fish' ® false
// Example 3: pattern = 'aaaa', str = 'dog cat cat dog' ® false
// Example 4:

import java.util.HashMap;

public class raja4 {

    public static boolean wordPattern(String pattern, String str) {
        String[] strarr = str.split("\\s+");
        char[] arr=pattern.toCharArray();
        HashMap<Character, String> map= new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i], strarr[i]);
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            
        }


        return true;
    }

    public static void main(String[] args) {

        // Test Case 1
        String pattern1 = "abba";
        String str1 = "dog cat cat dog";
        System.out.println(wordPattern(pattern1, str1)); // true

        // Test Case 2
        String pattern2 = "abba";
        String str2 = "dog cat cat fish";
        System.out.println(wordPattern(pattern2, str2)); // false

        // Test Case 3
        String pattern3 = "aaaa";
        String str3 = "dog cat cat dog";
        System.out.println(wordPattern(pattern3, str3)); // false

        // Test Case 4
        String pattern4 = "abcd";
        String str4 = "dog cat monkey dog";
        System.out.println(wordPattern(pattern4, str4)); // false
    }
}
