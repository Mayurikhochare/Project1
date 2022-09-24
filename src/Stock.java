public class Stock {
    public static int maxProfit(int[] prices){
        int maxprofit=0;
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                int profit=prices[j]-prices[i];
                System.out.println("By Buying On "+i+" day and selling on"+j+" day");
                System.out.println(profit);
                if(profit>maxprofit)
                    maxprofit=profit;
            }
        }
        return maxprofit;

    }

    public static void main(String[] args) {
        int[] prices={1,3,4,6,7};
        System.out.println("MaxProfit can be earned is "+maxProfit(prices));
    }
}
