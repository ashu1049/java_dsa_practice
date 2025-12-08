//Create an ArrayList of integers and find the maximum and minimum values.

package Collections.Lists;
import java.util.List;
import java.util.ArrayList;

public class Arraylist15 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(6);
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(3);

        int max=list.get(1);
        int min=list.get(1);

        for(int i=1;i<list.size();i++)
        {
            if(list.get(i)>max)
             max= list.get(i);
        }

        for(int i=1;i<list.size();i++)
        {
            if(list.get(i)<min)
             min= list.get(i);
        }

        System.out.println("Max element in list is: "+max);
        System.out.println("min element in list is: "+min);

    }
}
