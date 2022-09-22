import java.util.Scanner;

public class Mango {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row ,column and tree number");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int tree= sc.nextInt();

        if((tree>=1 && tree <col)||(tree%col==0)||(tree % row==1)){
            System.out.println("yes");
        }
        else {
            System.out.println("No");
        }
    }
}
