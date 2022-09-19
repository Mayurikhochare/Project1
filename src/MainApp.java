import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter mail");
        String email=sc.next();
        if(email.contains("@")&&email.contains(".")){
            System.out.println("email id is valid");
        }
        else{
            throw new InvalidEmailException("Invalid email id");
        }
    }
}
