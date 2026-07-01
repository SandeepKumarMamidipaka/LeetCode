class Solution:
    def isPalindrome(self, s: str) -> bool:
        s=s.lower()
        print(ord('z'))
        new_str=""
        for i in s:
            if (97 <= ord(i) <= 122) or (47 < ord(i) <= 57):
                new_str+=i
        rev_str=new_str[::-1]
        print(new_str)
        print(rev_str)
        return new_str==rev_str
        