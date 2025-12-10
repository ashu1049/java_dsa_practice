//Convert an ArrayList<Integer> into an array (Integer[]).
package Collections.Lists.Arraylist;
import java.util.List;
import java.util.ArrayList;

public class Arraylist18
{
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=10;i++)
        {
            list.add(i);
        }

        System.out.println(list);

        int arr[]=new int[list.size()];

        for(int j=0;j<list.size();j++)
        {
            arr[j]=list.get(j);
        }

       for(int j=0;j<list.size();j++)
        {
            System.out.print(arr[j]+", ");
        }
    }
}