class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        freq={}
        for i in range(len(s)):
            # if t[i] in freq.values():
            #     for key,value in freq.items():
            #         if t[i]==value:
            #             if s[i]!=key:
            #                 print(freq)
            #                 return True
            if s[i] not in freq.keys() and t[i] not in freq.values():
                # if t[i] not in freq.values():
                freq[s[i]]=t[i]
            else:
                if freq.get(s[i])!=t[i]:
                    return False
        print(freq) 
        return True
       