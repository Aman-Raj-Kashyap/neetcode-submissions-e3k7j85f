class Solution {
    public int maxProfit(int[] prices) {
        //O(n)
        int msf=prices[0],profit=0;
        for(int i=1;i<prices.length;i++){
            msf=Math.min(prices[i],msf);
            profit=Math.max(profit,prices[i]-msf);
        }
        return profit;

        /*O(n2)
        int maxVal=Integer.MIN_VALUE;
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                int profit=prices[j]-prices[i];
                if(profit>0 && profit>maxVal)
                    maxVal=profit;
            }
        }
        return maxVal==Integer.MIN_VALUE?0:maxVal;*/
    }
}
