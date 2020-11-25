class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        else:
            y = str(x)
            z = y[::-1] #翻转y
            if y == z:
                return True
            else:
                return False
solution = Solution()
flag = solution.isPalindrome(1212)
print(flag)