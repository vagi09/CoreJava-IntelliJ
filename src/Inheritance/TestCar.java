package Inheritance;

public class TestCar {

    public static void main(String[] args) {

        BMW b = new BMW();
        // method overriding : prioroty will be given to child class when same method is present in both child and parent class
        b.Start();

        b.Stop();
        b.theSaftey();
        b.refuel();

        System.out.println("----------");

        Car c = new Car();
        c.Start();
        c.refuel();
        c.Stop();

        System.out.println("----------");
        Car cl = new BMW(); // Dynamic polymorphsim
        cl.Start();
        cl.Stop();
        cl.refuel();



    }
}
