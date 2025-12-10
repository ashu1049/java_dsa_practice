//Given an ArrayList<String>, find the longest string.

package Collections.Lists.Arraylist;
import java.util.List;
import java.util.ArrayList;

public class Arraaylist23 {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("java");
        list1.add("cpp");
        list1.add("c");
        list1.add("html");
        list1.add("python");
        list1.add("swift");
        list1.add("javascript");
        list1.add("react");

        System.out.println(list1);

        String max_length= list1.get(0);

        for(int i=1;i<list1.size();i++)
        {
            if((list1.get(i).length())>max_length.length())
            {
                max_length=list1.get(i);
            }
        }
        System.out.println("Longest String in List is: "+max_length);
    }
}
