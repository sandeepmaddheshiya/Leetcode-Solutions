

public class Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] prices) {
        int left = 0, right = 1,max = 0;
        while(right < prices.length){
            if(prices[left] > prices[right]){
                left = right;
            }else if(prices[left] < prices[right]){
                max = Math.max(max,(prices[right] - prices[left]));
            }
            right++;
        }
        return max;
    }
}
