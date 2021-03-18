# 官方解答， 个人做了一些注解
class Solution:
    def isValid(self, s: str) -> bool:
        if len(s) % 2 == 1:
            return False

        pairs = {
            ")": "(",
            "]": "[",
            "}": "{",
        }
        stack = list()
        for ch in s:
            if ch in pairs:  # ch是右括号
                # 如果是空串或者ch右括号和栈顶的左括号不匹配，返回False
                if not stack or stack[-1] != pairs[ch]: 
                    return False
                # 匹配则推出栈
                stack.pop()
            # ch不是右括号，是左括号，则加入栈中
            else:
                stack.append(ch)
        
        #最后如果栈为空，则返回not stack的逻辑值，True
        return not stack

solution = Solution()
isvalid = solution.isValid("")
print(isvalid)