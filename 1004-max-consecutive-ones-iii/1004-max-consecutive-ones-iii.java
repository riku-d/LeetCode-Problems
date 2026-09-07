class Solution {
    public int longestOnes(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int l=0;
        map.put(0,0);
        int len=0;
        for(int r=0;r<nums.length;r++){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.get(0)>k){
                if(nums[l]==0){
                    map.put(0,map.get(0)-1);
                }
                l++;
            }
            len=Math.max(len,r-l+1);
        }
        return len;
    }
}