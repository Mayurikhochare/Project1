package Inheritance;

public class Child extends Parent{
    public void test(){
        System.out.println("Child Class");
    }

    public static void main(String[] args) {
        Child ch=new Child();
        ch.display();
        ch.test();
    }

}
