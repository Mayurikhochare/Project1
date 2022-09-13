public class Leap {
    public static void main(String[] args) {
        int year =2020;
        boolean leap=false;
        if ((year %4==0) && (year%100!=0) || (year %400==0)){
            System.out.println(year+"is a leap year");
        }
       else{
            System.out.println(year+"not leap year");

        }
    }

}
