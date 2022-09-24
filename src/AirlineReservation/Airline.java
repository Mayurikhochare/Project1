package AirlineReservation;

import java.util.*;

public class Airline {
    List<String> username = new ArrayList<>();
    List<String> password1 = new ArrayList<>();
    Scanner sc1=new Scanner(System.in);




    public void signUpMethod(String mail, String password) {
        username.add(mail);
        password1.add(password);
        System.out.println("User Registered Successfully");


    }

    public void login(String user, String pass) {
        for (int i = 0; i < username.size(); i++) {
            for (int j = 0; j < password1.size(); j++) {
                if (username.get(i).equals(user) && password1.get(j).equals(pass)) {
                    System.out.println("User Login Successfully");
                } else {
                    System.out.println("Username password Incorrect");
                }
            }
        }
    }
    public void bookFlight(String departure,String arrival,String time){
        System.out.println("Press 1 if want to book flight");
        int choice= sc1.nextInt();
        if(choice==1){
            System.out.println("Flight Booked Successfully !");
            System.out.println("Flight Details:");
            System.out.println("You have Flight from "+departure+" to "+arrival+" at "+time+" Time");
            System.out.println("Happy Journey......!");
        }
    }
}