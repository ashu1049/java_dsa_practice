// Q25. Use static block to initialize a message
// Print “Program Loaded” when class loads.


public class static_block25 {
    
    static
    {
        System.out.println("Program Loaded.");
    }
    void display(){};

    public static void main(String[] args) {
        
        static_block25 s1= new static_block25();
        //This dispaly method are just used to show the use of obejct.
        s1.display();
    }
}
