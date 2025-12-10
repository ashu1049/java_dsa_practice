//Rotate elements of an ArrayList<Integer> by k positions (e.g., [1,2,3,4,5] rotated by 2 → [4,5,1,2,3]).
package Collections.Lists.Arraylist;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist24{
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        for(int i=1;i<=10;i++)
        {
            list.add(i);
        }
        System.out.println("Current list: "+list);
        int l=list.size();

        Scanner sc = new Scanner(System.in);
        System.out.print("By how many position do you wanna rotate list with: ");
        int k = sc.nextInt();
        k= k%l;
        for(int i=0;i<k;i++)
        {
            list.add(0,0);
        }

        l=list.size();

        for(int i=0;i<k;i++)
        {
            list.set(i,list.get(l-k+i));
        }

        for(int i=0;i<k;i++)
        {
            list.remove(list.size()-1);
        }

        System.out.println("List after rotating by "+k+" positions: ");

        System.out.println(list);
        sc.close();
    }
}
