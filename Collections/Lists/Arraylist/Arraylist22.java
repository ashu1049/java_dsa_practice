//Write a program to remove duplicates from an ArrayList<Integer> without using Set

package Collections.Lists;
import java.util.List;
import java.util.ArrayList;
public class Arraylist22 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(3);
        list.add(4);
        list.add(7);
        list.add(8);
        list.add(3);
        list.add(1);
        System.err.print("List with Duplicates: ");
        System.out.print(list);
        System.out.println();

        list.sort(null);
    
        
        List<Integer> list2 = new ArrayList<>();
        for(int i=0;i<list.size()-1;i++)
        {
            if(list.get(i)!=list.get(i+1))
            {
                list2.add(list.get(i));
            }
        }
        System.err.print("List without Duplicates: ");
        System.out.print(list2);

    }
}
