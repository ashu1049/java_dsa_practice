package Collections.Lists;
import java.util.List;
import java.util.ArrayList;

public class Array_list3 {
    public static void main(String[] args) {
        List<Integer> list1= new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        // We can add a list in to another list using "addAll()"
        List<Integer> list2=List.of(4,5,6);

        list1.addAll(list2);

        System.err.println(list1);

    }
}
