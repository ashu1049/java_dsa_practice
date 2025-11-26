// Q5. Method Overloading Practice
// Create a class Calculator with 3 overloaded methods:
// •	add(int, int)
// •	add(double, double)
// •	add(int, int, int)


class overload5
{
    void add(int a, int b)
    {
        System.out.println(a+b);
    }
    void add(double l, double m)
    {
        System.out.println(l+m);
    }
    void add(int x, int y, int z)
    {
        System.out.println(x+y+z);
    }

    public static void main(String[] args) {
        
        overload5 o1= new overload5();
        o1.add(3,4);
        o1.add(4.5,3.5);
        o1.add(1,2,3);
    }
}