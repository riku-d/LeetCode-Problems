class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len = 0;
        int l=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1){
                l=i+1;
            }
            len=Math.max(len,i-l+1);
        }
        return len;
    }
}