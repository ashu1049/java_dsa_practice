package Collections.Lists.Arraylist;
import java.util.List;
import java.util.ArrayList;

public class Arraylist_sort {
    public static void main(String[] args) {
        
        List<Integer> list1= new ArrayList<>();
        list1.add(5);
        list1.add(2);
        list1.add(3);

        list1.sort(null);
        System.out.println(list1);

    }
}
