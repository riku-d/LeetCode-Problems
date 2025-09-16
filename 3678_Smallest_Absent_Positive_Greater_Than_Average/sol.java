class Solution {
    public int smallestAbsent(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int avg = sum / nums.length;
        int res = avg + 1;

        if (avg < 0) {
            res = 1;
            while (contains(nums, res)) {
                res++;
            }
            return res;
        }

        while (contains(nums, res)) {
            res++;
        }

        return res;
    }
    private boolean contains(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
