import java.util.Scanner;

public class circle_area {
    double a;
    double area(int r)
    {
        double a=3.14*r*r;
        return a;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        int r= sc.nextInt();

        circle_area c= new circle_area();
        
        System.out.println("Area of circle is : "+c.area(r));

        
        sc.close();
    }
}
