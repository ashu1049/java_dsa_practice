// Q12. Take marks of 3 subjects & print Grade
// •	≥90 → A
// •	75–89 → B
// •	60–74 → C
// •	<60 → Fail
import java.util.Scanner;

public class task12 {

    void grade(int sub1, int sub2, int sub3)
    {
        double avg=(sub1+ sub2+ sub3)/3.0;
        System.out.println("Average of marks of 3 subjects is: "+avg);

        if(avg>=90)
        System.out.println("Grade: A.");
        else if(avg>=75 && avg<90)
        System.out.println("Grade: B.");
        else if(avg>=60 && avg<75)
        System.out.println("Grade: c.");
        else if(avg<60)
        System.out.println("Grade: F.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of following subjects: ");
        System.out.print("sub1 marks: ");
        int sub1 = sc.nextInt();
        System.out.print("sub2 marks: ");
        int sub2 = sc.nextInt();
        System.out.print("sub3 marks: ");
        int sub3 = sc.nextInt();

        task12 t = new task12();
        t.grade(sub1, sub2, sub3);
        
        sc.close();

    }
}
