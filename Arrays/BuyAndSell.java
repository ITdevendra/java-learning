package Arrays;

public class BuyAndSell {

    public static void maxProfit(int stock[]){
        
        int profit = 0;
        for(int i=0; i<stock.length; i++){
            int buy = stock[i];{
                for(int j= i+1; j<stock.length; j++){
                    int sell = stock[j];
                    profit = Math.max(profit, sell-buy);
                }
            }
        }
        System.out.println(profit);
    }

    public static void optimizeProfit(int stock[]){
        int profit = 0;
        int buy = stock[0];

        for(int i=0; i<stock.length; i++){
            if(stock[i] < buy) buy = stock[i];

            else if(stock[i]-buy > profit)profit = stock[i]-buy;
        }
        System.out.println(profit);
    }
    public static void main(String[] args) {
        int stock[] = {7,12,0,9,11,4};
        //maxProfit(stock);

        optimizeProfit(stock);
    }
}
