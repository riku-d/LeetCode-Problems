class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int original= x;
        if (x>=0){
            while (x>0){
                int temp=x%10;
                rev = rev*10+temp;
                x=x/10;
            }
            if (rev==original){
                return true;
            }
        }
        else{
            return false;
        }
        return false;
    }
}