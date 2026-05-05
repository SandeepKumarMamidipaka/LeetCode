class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        # freq={}
        # for i in range(len(s)):
        #     if t[i] in freq.values():
        #         return False
        #     if s[i] not in freq.keys():
        #         freq[s[i]]=t[i]
        #     else:
        #         if freq.get(s[i])!=t[i]:
        #             return False
        # # print(freq) 
        # return True
        c=True
        b={}
        for i in range(len(s)):
            if s[i] not in b:
                b[s[i]]=t[i]
            elif b[s[i]] != t[i]:
                c=False
                break
        d={}
        e=True
        for i in range(len(s)):
            if t[i] not in d:
                d[t[i]]=s[i]
            elif d[t[i]] != s[i]:
                e=False
                break
        if e==False:
            return False
        elif c==False:
            return False
        else:
            return True