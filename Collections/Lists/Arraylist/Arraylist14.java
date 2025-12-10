//Check if an ArrayList contains a specific element (e.g., "Java").

package Collections.Lists.Arraylist;
import java.util.List;
import java.util.ArrayList;

public class Arraylist14 {
 public static void main(String[] args) {
    List<String> list1 = new ArrayList<>();
    list1.add("java");
    list1.add("cpp");
    list1.add("c");
    list1.add("html");

    List<String> list2 = new ArrayList<>();
    list2.add("python");
    list2.add("swift");
    list2.add("javascript");
    list2.add("react");

    System.out.println(list1.contains("java"));//true
    System.out.println(list2.contains("java"));//false

    }   
}
