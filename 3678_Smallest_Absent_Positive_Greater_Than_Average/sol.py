class Solution:
    def smallestAbsent(self, nums: List[int]) -> int:
        avg=(sum(nums)//len(nums))
        res=avg+1
        if avg < 0:
            res = 1
            while res in nums:
                res+=1
            return res
        while res in nums:
            res+=1
        return res