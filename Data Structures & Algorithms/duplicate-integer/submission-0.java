class Solution {
    public boolean hasDuplicate(int[] nums) {
        //O(n) O(n)
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])) return true;
            set.add(nums[i]);
        }
        return false;

        /*O(n2)
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j] && i!=j) return true;
            }
        }
        return false;*/
    }
}