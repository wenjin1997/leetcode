# 169.多数元素 排序法
class Solution:
    def majorityElement(self, nums: int) -> int:
        nums.sort()
        return nums[len(nums) // 2] # //表示向下取整
        
solution = Solution()
m_element = solution.majorityElement([1,1,1,1,1,4,2,3,7])
print(m_element)