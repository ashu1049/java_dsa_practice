import java.util.Scanner;
public class season_according_to_month {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the no. of month: ");
        int month= sc.nextInt();
        
        System.out.print("Current Season: ");

        if(month>=3 && month<=5)
        {
            System.out.println("Spring");
        }
        else if(month>=6 && month<=8)
        {
            System.out.println("Summer");
        }
        else if(month>=9 && month<=11)
        {
            System.out.println("Autumn");
        }
        else if(month==12 || month==1 || month==2)
        {
            System.out.println("Winter");
        }
        else
        {
            System.out.println("Invalid Month");
        }

        sc.close();

    }
}
