package easy;

public class LC121BestTimeToBuySellStock {
    public int maxProfit(int[] prices) {
        int min=0;
        int maxprice=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<prices[min])min=i;
            if(prices[i]-prices[min]>maxprice)maxprice=prices[i]-prices[min];
        }
        return maxprice;
    }

}
