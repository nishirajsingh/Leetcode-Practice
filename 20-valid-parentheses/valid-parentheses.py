class Solution:
    def isValid(self, s: str) -> bool:
        a= []
        for i in s:
            if i=="(" or i=="{" or i=="[":
                a.append(i)
            else:
                if len(a)==0:
                    return False
                if i==")" and a[-1]!="(":
                    return False
                if i=="}" and a[-1]!="{":
                    return False
                if i=="]" and a[-1]!="[":
                    return False
                a.pop()
        return len(a)==0