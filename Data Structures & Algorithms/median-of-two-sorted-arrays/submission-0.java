class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] nums=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                nums[k++]=nums1[i++];
            }
            else nums[k++]=nums2[j++];
        }
        while(i<m) nums[k++]=nums1[i++];
        while(j<n) nums[k++]=nums2[j++];
        
        int a=nums.length;
        if(a%2==1) return nums[a/2];
        else return (nums[a/2-1]+nums[a/2])/2.0;
    }
}
