package Collections.Lists.Arraylist;
import java.util.List;
import java.util.ArrayList;

public class Arraylist_to_array {
    public static void main(String[] args) {
        
        List<Integer> list1= new ArrayList<>();
        list1.add(1);
        list1.add(1);
        list1.add(1);

        Object arr[]=list1.toArray();
        Integer arr1[]= list1.toArray(new Integer[0]);

        System.out.println(arr);
        System.out.println(arr1);

    }
}
