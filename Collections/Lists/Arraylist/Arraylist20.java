//Remove all even numbers from an ArrayList<Integer>.

package Collections.Lists.Arraylist;

import java.util.List;
import java.util.ArrayList;

public class Arraylist20 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<11;i++)
        {
            list.add(i);
        }
        list.clear();

        System.out.println(list);
    }
}
