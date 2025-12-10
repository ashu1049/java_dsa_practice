//Write a program to store 5 strings in an ArrayList<String> and print them using a for-each loop.

package Collections.Lists.Arraylist;

import java.util.List;
import java.util.ArrayList;

public class Arraylist12 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");
        list.add("Melon");

        for(String i: list)
        {
            System.out.println(i);
        }
    }
}
