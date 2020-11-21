# 11.盛最多水的容器
# 解题思路：用双指针法，i指针在最左边，j指针在最右边
#         看i,j指针所对应的高度，谁小就往中间移动
class Solution:
    def maxArea(self, height) -> int:
        max_area = 0 
        i = 0
        j = len(height) - 1
        while i < j:
            area = (j - i) * min(height[i],height[j])
            if area > max_area:
                max_area = area
            if height[i] < height[j]:
                i = i + 1
            else:
                j = j - 1
        return max_area
solution = Solution()
max_area = solution.maxArea([1,8,6,2,5,4,8,3,7])
print(max_area)