class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //O(log(m+n))
        int[] smaller=nums1.length>nums2.length?nums2:nums1;
        int[] larger=nums1.length>nums2.length?nums1:nums2;
        int totalLength=nums1.length+nums2.length;

        int low=0,high=smaller.length;

        while(low<=high){
            int partitionX=(low+high)/2;
            int partitionY=(totalLength+1)/2-partitionX;

            int l1=partitionX==0?Integer.MIN_VALUE:smaller[partitionX-1];
            int r1=partitionX==smaller.length?Integer.MAX_VALUE:smaller[partitionX];

            int l2=partitionY==0?Integer.MIN_VALUE:larger[partitionY-1];
            int r2=partitionY==larger.length?Integer.MAX_VALUE:larger[partitionY];

            if(l1<=r2 && l2<=r1){
                if(totalLength%2==0)
                    return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                else
                    return Math.max(l1,l2);
            }
            if(l1>r2) high=partitionX-1;
            else low=partitionX+1;
        }
        return 0;
        
        /*O(m+n)
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
        else return (nums[a/2-1]+nums[a/2])/2.0;*/
    }
}