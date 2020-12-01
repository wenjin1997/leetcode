# 14.最长公共前缀/Longest Common Prefix
class Solution:
    def longestCommonPrefix(self, strs) -> str:
        if not strs:
            return ""
        minlen_index = 0
        minlen_element = len(strs[0])
        longest_common_prefix = ""
        flag = 0
        for i in range(len(strs)):
            current_len = len(strs[i])
            if len(strs[i]) < minlen_element:
                minlen_index = i
                minlen_element = current_len
        for k in range(len(strs[minlen_index])):
            for i in range(len(strs)):
                if strs[i][k] == strs[minlen_index][k]:
                    flag = flag + 0
                else:
                    flag = flag + 1
            if flag == 0:
                longest_common_prefix = longest_common_prefix + strs[minlen_index][k]
        return longest_common_prefix

solution = Solution()
strs = ["flag", "foag"]
longest_common_prefix = solution.longestCommonPrefix(strs)
print(longest_common_prefix)