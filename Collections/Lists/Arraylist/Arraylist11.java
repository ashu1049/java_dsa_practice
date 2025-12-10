//Create an ArrayList<Integer> and add numbers 1 to 10. Print them using a for loop.

package Collections.Lists.Arraylist;

import java.util.List;
import java.util.ArrayList;

public class Arraylist11 {
    
    public static void main(String[] args) {
        
        List <Integer> list1 = new ArrayList<>();
        for(int i=1;i<=10;i++)
        {
            list1.add(i);
        }
        
        
        System.out.println(list1);
    }
}
 