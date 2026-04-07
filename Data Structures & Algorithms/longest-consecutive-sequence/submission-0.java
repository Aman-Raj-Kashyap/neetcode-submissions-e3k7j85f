class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int maxCount=0;
        for(int num:nums) set.add(num);

        for(int i=0;i<nums.length;i++){
            int n=nums[i],count=0;
            while(set.contains(n++)){
                count++;
            }
            maxCount=Math.max(maxCount,count);
        }
        return maxCount;
    }
}
