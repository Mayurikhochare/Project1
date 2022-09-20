package Inheritance;

class Country {
    void info(String country) {
        System.out.println("Country name:"+country);
    }
}
class State extends Country{
    void display(String state) {
        System.out.println("State name:"+state);
    }
}
public class District extends State{
    void test(String district) {
        System.out.println("District name:"+district);
    }

    public static void main(String[] args) {
        District d1=new District();
        d1.info(" India");
        d1.display(" Maharashtra");
        d1.test(" Satara");
    }
}

