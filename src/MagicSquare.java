import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        int[][] array=new int[n][n];
        int sum,sum1,sum2;
        int row,col;

        int flag=0;
        for(row=0;row<n;row++){
            for(col=0;col<n;col++){
                array[row][col]=sc.nextInt();
            }
        }
        sum=0;
        for(row=0;row<n;row++){
            for(col=0;col<n;col++){
                if(row==col){
                    sum=sum+array[row][col];
                }
            }
        }
        for(row=0;row<n;row++) {
            sum1=0;
            for (col = 0; col < n; col++) {
                sum1 = sum1 + array[row][col];
            }
            if (sum == sum1)
                flag = 1;
            else
            {
                flag = 0;
                break;
            }
        }

        for(col=0;col<n;col++) {
            sum2=0;
            for (row = 0; row < n; row++) {
                sum2 = sum2 + array[row][col];
            }
            if (sum == sum2)
                flag = 1;
            else
            {
                flag = 0;
                break;
            }
        }
        if(flag==1)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
