import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num==1){
            System.out.println("1");
            System.out.println("0");
        }else {
            while (num != 1) {

                if (num % 2 == 0) {
                    System.out.println(num);
                    num = num / 2;

                } else {
                    System.out.println(num);
                    num = (3 * num) + 1;

                }
            }
        }




    }
}
