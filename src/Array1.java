import java.util.*;
public class Array1 {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
            int res = evenOddMixed(n, array);
            if(res==1)
                System.out.println("Odd");
            else if(res==2)
                System.out.println("Even");
            else
                System.out.println("Mixed");
        }


        static int evenOddMixed(int n,int[] arr) {
            int odd = 0, even = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 1)
                    odd++;
                else
                    even++;
            }

            if (odd == n)
                return 1;
            else if (even == n)
                return 2;
            else
                return 3;

        }
}