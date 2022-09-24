package AirlineReservation;

import java.util.*;
import AirlineReservation.*;
public class MainApp{
    public static void main(String[] args) {
        Map<String,String> map1=new HashMap<>();
        map1.put("Delhi","pune");
        map1.put("Satara","Gujrat");
        map1.put("Bombay","Mumbai");

        List<String> time=new ArrayList<>();
        time.add("10AM");
        time.add("12PM");
        time.add("3PM");
        time.add("6PM");
        time.add("9PM");

        Airline airline=new Airline();
        Scanner sc=new Scanner(System.in);
        boolean status=true;
        while(status){
            System.out.println("1.SignUp");
            System.out.println("2.Login");
            System.out.println("3.Book a flight");
            System.out.println("4.exit");
            int choice= sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter Full Name");
                    sc.next();
                    System.out.println("Enter Mail Id");
                    String mail = sc.next();
                    System.out.println("Enter Password");
                    String password = sc.next();
                    airline.signUpMethod(mail, password);
                }
                case 2 -> {
                    System.out.println("Enter Username & password");
                    String user = sc.next();
                    String pass = sc.next();
                    airline.login(user, pass);
                }
                case 3 -> {
                    System.out.println("Enter Departure name");
                    String departure = sc.next();
                    System.out.println("Enter Arrival Point");
                    String arrival = sc.next();
                    String time1;
                    if (map1.containsKey(departure) && map1.containsValue(arrival)) {

                        System.out.println("Departure and Arrival points available enter time");
                        System.out.println("Enter time");
                        time1 = sc.next();
                        if (time.contains(time1)) {
                            System.out.println("flight available");
                            airline.bookFlight(departure, arrival, time1);
                        } else {
                            System.out.println("flight Not available at given time");
                            //airline.bookFlight(departure, arrival, time1);

                        }


                    } else {
                        System.out.println("Departure and Arrival points not available");
                    }
                }
                default -> status = false;
            }
        }
    }
}
