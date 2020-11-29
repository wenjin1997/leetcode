# 13.罗马数字转整数/Roman to Integer
class Solution:
    def romanToInt(self, s: str) -> int:
        dict = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100,
        'D': 500, 'M': 1000, 'IV': 4, 'IX': 9, 'XL': 40,
        'XC': 90, 'CD': 400, 'CM': 900}
        integer = 0
        n = len(s)
        i = 0
        while i < n:
            if s[i:i+2] in dict:
                integer = integer + dict[s[i:i+2]]
                i = i + 2
            else:
                integer = integer + dict[s[i]]
                i = i + 1
        return integer


solution = Solution()
s = "MCMXCIV"
integer = solution.romanToInt(s)
print(integer)