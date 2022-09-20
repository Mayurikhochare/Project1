public class Holiday {
    private String name;
    private int day;
    private String month;
    private String month1;

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }
    public boolean inSameMonth(Holiday holiday){
        return this.month.equals(holiday.month);

    }
    public double avgdate(Holiday[] hol){
        int sum = 0;
        for(Holiday h:hol) {
            sum = sum + h.day;
        }
        double avg=sum/ hol.length;
        return avg;
    }

    public static void main(String[] args) {
        Holiday[] list=new Holiday[2];
        Holiday holiday=new Holiday("Ganesh Utsav",10,"september");
        Holiday holiday1=new Holiday("Republic day",20,"january");
        list[0]=holiday;
        list[1]=holiday1;
        boolean b=holiday.inSameMonth(holiday1);
        System.out.println(b);
        System.out.println(holiday.avgdate(list));

    }
}
