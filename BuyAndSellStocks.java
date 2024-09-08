import java.util.*;

public class BuyAndSellStocks{
    public static int BuyAndSellStocks(int prices[]){
        int buyPrice = prices[0];
        int maxProfit = Integer.MIN_VALUE;

        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){ //profit
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            }else{ //buyprice > prices[i]
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        System.out.println(BuyAndSellStocks(prices));
    }
    
}