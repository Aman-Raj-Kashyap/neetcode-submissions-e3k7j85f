class Solution {
    private long timeToEatBanana(int[] piles, int h){
        long k=0;
        for(int i=0;i<piles.length;i++){
            k+=(long)Math.ceil((double)piles[i]/h);
        }
        return k;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int maxVal=Integer.MIN_VALUE, result=0;
        for(int i=0;i<piles.length;i++){
            maxVal=Math.max(maxVal,piles[i]);
        }

        int low=1,high=maxVal;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(timeToEatBanana(piles,mid)<=h){
                result=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return result;
    }
}
