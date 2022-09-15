import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int max=array[0];
        int min=array[0];
        for (int i=1;i<n;i++){
            if(array[i]>max)
                max=array[i];
        }
        for (int i=1;i<n;i++){
            if(array[i]<min)
                min=array[i];
        }
        int range=max-min;
        System.out.println(range);

    }
}
