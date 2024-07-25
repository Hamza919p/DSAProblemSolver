package Arrays.BuyAndSell;

public class BuyAndSell {

    /**
     * Below input array values represents stock prices on specific days. Indexes are represented as days
     * Condition is you can not sell a price before buying it.
     * 
     * Brute force is that simply pick the first index value and compare (calculate difference) with others.
     * And you will find max profit. 
     * 
     * TIME COMPLEXITY => O(N)^2
     * 
     * **/

    public int maxProfitBruteForce(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int currProfit = prices[j] - prices[i];
                if (maxProfit < currProfit) {
                    maxProfit = currProfit;
                }
            }
        }
        return maxProfit;
    }





    /**
     * Optimal approach will be to do 2 things
     * 
     * Only update buy price when upcoming buy price is lesser then current buy price.
     * means only update buy price if next value is lesser then current value
     * 
     * else
     * 
     * Check if the next value (stock price) is greater then buy price, then it means we can sell it.
     * So calculate the difference and replace it with max profit if condition met
     * 
     * Time complextiy => O(N)
     * 
     * **/

    public int maxProfitOptimal(int[] prices) {

        int buyPrice = 0;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++) {
            //only update the buy price if current buy price is greater then upcoming buy price
            if(i == 0 || buyPrice > prices[i]) {
                buyPrice = prices[i];
            } else {
                int currProfit = prices[i] - buyPrice;
                if(currProfit > maxProfit) {
                    maxProfit = currProfit;
                }
            }
        }
        return maxProfit;
    }

    
}
