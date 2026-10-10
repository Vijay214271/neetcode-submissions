class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit=0;
        for(int p : prices){
            int profit=p-minPrice;
            if(minPrice>p){
                minPrice=p;
            }
            maxProfit=Math.max(profit,maxProfit);
        }
        return maxProfit;
    }
}