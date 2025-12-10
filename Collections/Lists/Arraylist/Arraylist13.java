//Add elements to an ArrayList, then remove one element by index and one by value. Print the result.

package Collections.Lists.Arraylist;
import java.util.List;
import java.util.ArrayList;

public class Arraylist13 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for(int i=1;i<=10;i++)
        {
            list.add(i);
        }
        //removing by index
        list.remove(5);

        //remove by value
        list.remove(Integer.valueOf(6));

        System.out.println(list);
    }
}
