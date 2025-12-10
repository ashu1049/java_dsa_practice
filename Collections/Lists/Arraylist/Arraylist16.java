//Reverse an ArrayList<Integer> without using Collections.reverse().

package Collections.Lists.Arraylist;
import java.util.List;
import java.util.ArrayList;

public class Arraylist16 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<11;i++)
        {
            list.add(i);
        }

        int s=0;
        int e=list.size()-1;
        int temp;

        while(e>s)
        {
            temp=list.get(s);
            list.set(s,list.get(e));
            list.set(e,temp);

            s++;
            e--;
        }

        System.out.println(list);
    }    
}
