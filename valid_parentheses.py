#个人解答 有误 少考虑了一些情况
class Solution:
    def isValid(self, s: str) -> bool:
        group = "([{)]}"
        if(len(s) % 2 != 0):
            return False
        else:
            k = int((len(s)) / 2)
            n = k
            i = k -1
            j = k
            while n > 0:
                a = group.index(s[i])
                b = group.index(s[j])
                if ((a != b + 3) and (a != b - 3)):
                    return False
                i = i - 1
                j = j + 1
                n = n - 1
            return True

solution = Solution()
isvalid = solution.isValid("(){}}{")
print(isvalid)