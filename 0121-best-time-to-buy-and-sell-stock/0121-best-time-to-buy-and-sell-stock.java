class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int profit=0;
        int mp=0;
        for(int r=0;r<prices.length;r++){
            profit=prices[r]-prices[l];
            while(profit<0 && l<r){
                l++;
                profit=prices[r]-prices[l];
            }
            mp=Math.max(mp,profit);
        }
        return mp;
    }
}