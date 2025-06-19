class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length];
       for (int i=0;i< nums1.length;i++){
           int max=nums1[i];
           br:
           for (int j = 0; j < nums2.length; j++) {
               if (nums1[i]==nums2[j]){
                   for (int k = j; k < nums2.length ; k++) {
                       if(max<nums2[k]){
                           max=nums2[k];
                           break br;
                       }
                   }
               }
           }
           if (max==nums1[i])
               res[i]=-1;
           else res[i]=max;
       }
        return res;
    }
}
