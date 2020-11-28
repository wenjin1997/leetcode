'''
7.整数反转
给出一个32位的有符号整数，你需要将这个整数中每位上的数字进行反转
题解思路：
分非负数和负数两种情况，先进行反转，对绝对值转化为字符串后反转，
再转化为整数，反转后判断是否溢出，溢出则返回0.
'''
class Solution:
    def reverse(self, x: int) -> int:
        if x >= 0:
            x_reverse = int(str(x)[::-1]) # 先类型转化为字符串，字符串切片后反转，再转化为整型
            if x_reverse > pow(2,31) - 1:
                return 0
            else:
                return x_reverse
        else:
            x_reverse = -int(str(-x)[::-1])
            if x_reverse < - pow(2,31):
                return 0
            else:
                return x_reverse
solution = Solution()
x_reverse = solution.reverse(237469461627342318)
print(x_reverse)