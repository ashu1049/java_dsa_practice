// Q3. Create an abstract class Shape
// •	Abstract method: calculateArea()
// •	Subclasses: Circle, Rectangle
// •	Accept user input and print area.


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

public class calculate {
    public static void main(String[] args) {
        
    }
}
