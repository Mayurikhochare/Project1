package Inheritance;
class Car{
    String company="Suzuki";
    double price=1000000.00;
    void test(){
        System.out.println("Company Name"+company);
        System.out.println(("price"+price));
    }
}
public class ElectricalCar extends Car{
    void display()
    {
        System.out.println("This is electrical car");
    }
}
