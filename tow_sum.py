# 1.两数之和/Two Sum
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                while nums[i] + nums[j] == target:
                    return [i, j]