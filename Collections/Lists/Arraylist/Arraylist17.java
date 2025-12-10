//- Merge two ArrayList<String> into one.


package Collections.Lists.Arraylist;
import java.util.List;
import java.util.ArrayList;

public class Arraylist17 {
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

    list1.addAll(list2);
    System.out.println(list1);
        
    }
}
