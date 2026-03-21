// Q7. Jack is always excited about Sunday. It is favorite day, when he gets to play all day. And goes to cycling with his friends.
// So, every time when the months starts he counts the number of Sundays he will get to enjoy. Considering
// the month can start with any day, be it Sunday, Monday..... Or so on.
// Count the number of Sunday jack will get within n number of days.

// Example 1:

// Input
// mon -> input String denoting the start of the month.
// 13 -> input integer denoting the number of days from the start of the month.

// Output :
// 2 -> number of days within 13 days.

import java.util.Scanner;

public class practice6 {
    public static int countSundays(String startDay, int n) {
        int c = 0;

        if (startDay.equals("Sunday")) {
            c = 0;
        } else if (startDay.equals("Monday")) {
            c = 1;
        } else if (startDay.equals("Tuesday")) {
            c = 2;
        } else if (startDay.equals("Wednesday")) {
            c = 3;
        } else if (startDay.equals("Thursday")) {
            c = 4;
        } else if (startDay.equals("Friday")) {
            c = 5;
        } else if (startDay.equals("Saturday")) {
            c = 6;
        }


        return (n+c)/7; // temporary
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start day: ");
        String startDay = sc.next();

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int result = countSundays(startDay, n);

        System.out.println("Number of Sundays: " + result);

        sc.close();
    }
}
