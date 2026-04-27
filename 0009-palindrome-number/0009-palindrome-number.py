class Solution:
    def isPalindrome(self, x: int) -> bool:
        s=str(x)
        i=0
        j=len(s)-1
        count=0
        while(i<j):
            if(s[i]==s[j]):
                i=i+1
                j=j-1
            else:
                count+=1
                return False
        if count==0:
            return True
        return False