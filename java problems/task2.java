// Q2. Create a class Vehicle and subclass Car
// •	Vehicle fields: brand, speed
// •	Car fields: seats
// •	Override method displayInfo() in both.


class vehicle{

    String brand="bmw";
    int speed=40;

    void displayInfo()
    {
        
    }
    
}
class Car extends vehicle{
    int seats=7;

    void displayInfo()
    {
        System.out.println("Brand of car is "+brand);
        System.out.println("Speed of car is "+speed);
        System.out.println("seats in car is "+seats);
    }

}

class task2
{
    public static void main(String[] args) {
        
        Car c1= new Car();
        c1.displayInfo();

    }
}
