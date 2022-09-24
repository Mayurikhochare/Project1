import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Triplets {
    public List<List<Integer>> findtriplets(int[] arr,int targetSum){
        Arrays.sort(arr);
        List<List<Integer>> triplets=new ArrayList<>();
        for(int i=0;i<arr.length-2;i++){
            int sum=targetSum-arr[i];
            //System.out.println(sum);

            int start=i+1;
            int end= arr.length-1;

            while(start<end){
                int t=arr[start]+arr[end];
                System.out.println(t);
                if(t==sum){
                    triplets.add(Arrays.asList(arr[start],arr[end],arr[i]));
                    start++;
                    end--;
                }
                else if(t<sum){
                    start++;
                }else {
                    end--;
                }
            }
        }
        return triplets;

    }


    public static void main(String[] args) {
//        int[] arr=new int[6];
//        Scanner sc=new Scanner(System.in);
//        for(int i=0;i<= arr.length-1;i++){
//            arr[i]= sc.nextInt();
//        }
        int[] arr={-1,0,1,2,-1,-4};
        int targetSum=0;
        Triplets triplets=new Triplets();
        List<List<Integer>> list=triplets.findtriplets(arr,targetSum);
        System.out.println(list);


    }
}
