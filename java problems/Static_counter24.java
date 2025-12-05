// Q24. Count how many objects are created
// Create class Employee.
// Use a static counter to track object count.

public class Static_counter24
{
    static int counter=0;
    Static_counter24()
    {
        counter++;
    }
    void display(){};
    

    public static void main(String[] args) {
        Static_counter24 s1=new Static_counter24();
        Static_counter24 s2=new Static_counter24();
        Static_counter24 s3=new Static_counter24();
        Static_counter24 s4=new Static_counter24();
        Static_counter24 s5=new Static_counter24();
        Static_counter24 s6=new Static_counter24();

        //This dispaly methods are just used to show the use of obejct.
        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
        s6.display();

        System.out.println("No.of object created: "+counter);
    }
}