class Solution {
    public boolean isPalindrome(String s) {
        int left=0,right=s.length()-1;

        while(left<=right){
            char lch=s.charAt(left);
            char rch=s.charAt(right);

            if(!Character.isLetterOrDigit(lch)){
                left++;
            }
            else if(!Character.isLetterOrDigit(rch)){
                right--;
            }
            else{
                if(Character.toLowerCase(lch)!=Character.toLowerCase(rch)) return false;
                left++;right--;
            }
        }
        return true;
    }
}
