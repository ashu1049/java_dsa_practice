package Collections.Lists;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Types_ti_Initilize_Arraylist {
    
    public static void main(String[] args) {
        
    //1
    List<Integer> list1= new ArrayList<>();
    list1.add(1);
    list1.add(2);

    //2
    List<Integer> list2= List.of(4,5,6);//This list can not be modified because we made this using List.of
    List<Integer> list21= new ArrayList<>(list2);//But we can create new list and give reference of pre. list and modify it 

    List<Integer> list3= Arrays.asList(7,8,9);

    Integer[] arr={10,11,12};
    List<Integer> list4= Arrays.asList(arr);

    System.out.println(list1);
    System.out.println(list2);
    System.out.println(list21);
    System.out.println(list3);
    System.out.println(list4);
    }
}
