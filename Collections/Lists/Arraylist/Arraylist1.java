package Collections.Lists.Arraylist;
import java.util.List;
import java.util.ArrayList;

public class Arraylist1{
    
    public static void main(String[] args) {

        //Creation of list
        List<Integer> list = new ArrayList<>(1000);
        //adding elements in list
        list.add(50);
        list.add(60);
        list.add(70);

        list.add(1, 55);//TO Add the element at index 1
        list.set(2, 65);//TO Replace the element at index 1

        System.out.println(list.get(2));//Print the element from the particular index
        System.out.println(list.contains(50));//To check if any object is present in list or not 
        System.out.println(list.size());// To Print the size of list
        System.out.println(list);// To Print the list
    }
}