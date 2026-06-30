class Solution:
    def maximum69Number (self, num: int) -> int:
        s = str(num)

        max_val=float('-inf')
        list1 = list(s)
        for i in range(len(list1)):
            if list1[i] == '9':
                list1[i]='6'
            else:
                list1[i]='9'
            res=int((''.join(list1)))
            print(res)
            if max_val<res:
                max_val=res
            list1=list(s)
        if max_val<num:
            return num
        return max_val
        