// Q3. Create an abstract class Shape
// •	Abstract method: calculateArea()
// •	Subclasses: Circle, Rectangle
// •	Accept user input and print area.

import java.util.Scanner;

abstract class shape
{
    void calculateArea(){}
}
class circle extends shape
{
    void calculateArea(double radius)
    {
        double area = 3.14*radius*radius;
        System.out.println("Area of circle is: "+area);
    }
}
class rectangle extends shape
{
    void calculateArea(double length, double width)
    {
        double area = length*width;
        System.out.println("Area of rectangle is: "+area);
    }
}

public class calculate {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        circle c1=new circle();
        System.out.println("Enter the radius of circle: ");
        double radius=sc.nextDouble();
        c1.calculateArea(radius);

        System.out.println();

        rectangle r1=new rectangle();
        System.out.println("Enter the length of rectangle: ");
        double length=sc.nextDouble();
        System.out.println("Enter the width of rectangle: ");
        double width=sc.nextDouble();

        r1.calculateArea(length, width);

        sc.close();
    }
}
