class Solution:
    def maximum69Number (self, num: int) -> int:
        s=str(num)
        list1=[num]
        for i in range(len(s)):
            if s[i]=='9':
                s=s[0:i]+'6'+s[i+1:len(s)]
            else:
                s = s[0:i] + '9' + s[i+1:len(s)]
            list1.append(int(s))
            s=str(num)
        return max(list1)
        