package Inheritance;

public class MainApp {
    public static void main(String[] args) {

        ElectricalCar e1=new ElectricalCar();
        e1.display();
        Petrolcar p1=new Petrolcar();
        p1.show();
        System.out.println("Company name "+p1.company);
        System.out.println("Price "+p1.price);
    }
}
