//ort an ArrayList<String> alphabetically.

package Collections.Lists.Arraylist;

import java.util.List;
import java.util.ArrayList;


public class Arraylist19 {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        list.add("mango");
        list.add("apple");
        list.add("banana");
        list.add("melon");
        list.add("chiku");
        list.add("grapes");

        list.sort(null);

        System.out.println(list);
    }
}
