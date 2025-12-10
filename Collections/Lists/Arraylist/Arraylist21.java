//Implement a method that takes an ArrayList<Integer> and returns a new list with only prime numbers.


package Collections.Lists.Arraylist;

import java.util.List;
import java.util.ArrayList;

public class Arraylist21 {

    static boolean isprime(int num)
    {
        if(num<=2) return false;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        
        List<Integer> list  = new ArrayList<>();
        for(int i=1;i<=20;i++)
        {
            list.add(i);
        }

        System.out.println(list);

        List<Integer> list1  = new ArrayList<>();
        for(int i=0;i<20;i++)
        {
            int num=list.get(i);
            if(isprime(num))
            {
                list1.add(Integer.valueOf(num));
            }
        }

        System.out.println(list1);
    }


}
