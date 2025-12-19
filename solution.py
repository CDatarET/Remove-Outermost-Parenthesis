class Solution:
    def removeOuterParentheses(self, s):
        stack = -1
        pairs = []

        for i in range(len(s)):
            if s[i] == "(":
                if(stack == -1):
                    pairs.append(i)
                stack += 1
            else: stack -= 1

            if stack == -1:
                pairs.append(i)

        ret = ""
        trav = 0
        for i in range(len(s)):
            if(i == pairs[trav]):
                trav += 1
                continue

            ret = ret + s[i]

        return(ret)
