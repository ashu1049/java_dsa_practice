package Collections.Lists;
import java.util.List;
import java.util.ArrayList;
public class Arraylist25 {
    public static void main(String[] args) {
        
        List<String> list1 = new ArrayList<>();
        list1.add("java");
        list1.add("cpp");
        list1.add("c");
        list1.add("html");
        list1.add("python");
        list1.add("swift");

        List<String> list2 = new ArrayList<>();
        list2.add("java");
        list2.add("cpp");
        list2.add("c");
        list2.add("html");
        list2.add("python");
        list2.add("swift");

        List<String> list3 = new ArrayList<>();
        list3.add("java");
        list3.add("cpp");
        list3.add("c");
        list3.add("html");
        list3.add("Javascript");
        list3.add("React");
        
        int l1=list1.size();
        int l2=list2.size();
        int l3=list3.size();
        //for list1 and list2
        if(l1==l2)
        {
            boolean r=true;
            for(int i=0;i<l2;i++)
            {
                if(list1.get(i)!=list1.get(i))
                r=false;     
            }
            if(r)
                System.out.println("List1 and List2 are equal.");
                else
                System.out.println("List1 and List2 are not equal.");
        }

        //for list2 and list2
        if(l2==l3)
        {
            boolean r=true;
            for(int i=0;i<l2;i++)
            {
                if(list2.get(i)!=list3.get(i))
                r=false;     
            }
            if(r)
                System.out.println("List2 and List3 are equal.");
                else
                System.out.println("List2 and List3 are not equal.");
        }
        //for list1 and list3
        if(l1==l3)
        {
            boolean r=true;
            for(int i=0;i<l2;i++)
            {
                if(list1.get(i)!=list3.get(i))
                r=false;     
            }
            if(r)
                System.out.println("List1 and List3 are equal.");
                else
                System.out.println("List1 and List3 are not equal.");
        }
    }
}
