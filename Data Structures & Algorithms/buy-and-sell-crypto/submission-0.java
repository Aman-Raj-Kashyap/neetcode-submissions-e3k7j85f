class Solution {
    public int maxProfit(int[] prices) {
        int maxVal=Integer.MIN_VALUE;

        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                int profit=prices[j]-prices[i];
                if(profit>0 && profit>maxVal)
                    maxVal=profit;
            }
        }
        return maxVal==Integer.MIN_VALUE?0:maxVal;
    }
}
