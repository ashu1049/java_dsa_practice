package Collections.Lists.Arraylist;
import java.util.List;
import java.util.ArrayList;

public class Arraylist4{
    
    public static void main(String[] args) {

        //Creation of list
        List<Integer> list1 = new ArrayList<>(1000);
        //adding elements in list
        list1.add(1);
        list1.add(2);
        list1.add(3);

        //how to to remove element 1

        list1.remove(1);
        System.out.println(list1);
        //But this will remove the element which is presemt on index 1, so we create a wrapper
       
        List<Integer> list2 = new ArrayList<>(1000);
        list2.add(1);
        list2.add(2);
        list2.add(3);

        list2.remove(Integer.valueOf(1));//This will remove the emement 1 from list
        System.out.println(list2);
        
    }
}