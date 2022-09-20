package Polymorphism;

public class SBI extends Bank{
    double accountBalance=0;
    @Override
    void deposit(double amt) {
        System.out.println(amt+" Rs Credited");
        accountBalance=amt;

    }

    @Override
    void displayBalance() {
        System.out.println("Account Balance"+accountBalance);
    }
}
