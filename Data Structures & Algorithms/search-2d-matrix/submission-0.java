class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //O(logm*logn)
        int row=matrix.length,col=matrix[0].length;
        int low=0,high=row*col-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int midVal=matrix[mid/col][mid%col];
            if(midVal==target) return true;
            else if(midVal>target) high=mid-1;
            else low=mid+1;
        }
        return false;
        
        /*O(m*logn)
        int row=matrix.length, col=matrix[0].length;
        for(int i=0;i<row;i++){
            if(target>=matrix[i][0] && target<=matrix[i][col-1]){
                int low=0,high=matrix[i].length-1;
                while(low<=high){
                    int mid=low+(high-low)/2;
                    if(matrix[i][mid]==target) return true;
                    else if(matrix[i][mid]>target) high=mid-1;
                    else low=mid+1;
                }
            }
        }
        return false;*/
    }
}
