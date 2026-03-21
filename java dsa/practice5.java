// Q6. Write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, return an empty string "".

// Example 1:
// Input: strs = ["flower", "flow", "flight"]
// Output: "fl"

// Example 2:
// Input: strs = ["dog", "racecar", "car"]
// Output: ""

import java.util.Scanner;

public class practice5 {
    public static String prefix(String[] arr)
    {
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<arr[0].length();i++)
        {
            char ch=arr[0].charAt(i);
            for(int j=1;j<arr.length;j++)
            {
                if(i>=arr[j].length())
                {
                    return sb.toString();
                }
                if(arr[j].charAt(i)!=ch)
                {
                    return sb.toString();
                }
            }
            sb.append(ch);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of Array:");
        // int n=sc.nextInt();
        // String[] arr=new String[n];
        // for(int i=0;i<n;i++)
        // {
        //     arr[i]=sc.next();
        // }

        String[] arr = {"flower", "flow", "flight"};

        System.out.println("Common prefix for array is: "+prefix(arr));

        sc.close();
    }
}
