// Given an array of colours, find the first colour that appears an odd number of times. If no such colour exists, return "All are even".

// Given a string containing '*' and '#'
// Return the difference: count(*) - count(#)
// Positive if '*' > '#'
// Negative if '#' > '*'
// 0 if both are equal

//import java.util.Scanner;

import java.util.HashMap;

public class practice3 {
    public static char oddballon(char[] arr) {
        HashMap<Character, Integer> map= new HashMap<>();
        for(char ch:arr)
        {
             map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(char ch:arr)
        {
            if(map.get(ch)%2==1) return ch;
        }

        return '@';
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of array:");
        // int n = sc.nextInt();
        // char[] arr= new char[n];
        // for(int i=0;i<arr.length;i++)
        // {
        //     arr[i]=sc.nextChar();
        // }

        char[] arr={'r', 'g', 'b', 'b', 'g', 'y', 'y'};
        char ch=oddballon(arr);
        if(ch=='@')
        System.out.println("All are even. ");
        else
        System.out.println("Ans is: "+ch);
        //sc.close();

    }
}
