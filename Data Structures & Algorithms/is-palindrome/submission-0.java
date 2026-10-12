class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            char leftCh = s.charAt(left);
            char rightCh = s.charAt(right);
            if(!Character.isLetterOrDigit(leftCh)){left++;continue;} 
            if(!Character.isLetterOrDigit(rightCh)){right--;continue;}
            char leftChar = Character.toLowerCase(leftCh);
            char rightChar = Character.toLowerCase(rightCh);
            if(leftChar==rightChar){
                left++;
                right--;
            }
            if(leftChar!=rightChar){
                return false;
            }
        }
        return true;
    }
}
