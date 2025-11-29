// Q4. Demonstrate Constructor Overloading
// Create the class Student with:
// •	Default constructor
// •	Parameterized constructor (name, age, grade)

public class constructor_overload4 {

    String name;
    int age;
    char grade;

    
    constructor_overload4()
    {
        System.out.println("This is defalut constructor and called automatically when object is created.");
    }

    constructor_overload4(String name, int age, char grade)
    {
        this.name=name;
        this.age=age;
        this.grade=grade;

        
    }

    void display()
    {
        System.out.println("Name: "+name+", Age: "+age+", Grade: "+grade+".");
    }

    public static void main(String[] args) {
        constructor_overload4 c1 = new constructor_overload4();
        constructor_overload4 c2 = new constructor_overload4("Ashutosh",21,'a');
        
        c1.display();
        c2.display();
    }
}
