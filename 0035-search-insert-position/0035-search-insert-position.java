class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        if(nums.length==1 && nums[0]>target){
            return 0;
        }
        // else {return 1;}
        while(j>=i){
            int mid=(i+j)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){   
                i=0;
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        
        i=0;j=i+1;
        while(j!=nums.length){
            if(nums[i]<target && nums[j]>target){
                return j;
            }
            if(nums[i]>target){
                return 0;
            }
            i++;
            j++;
        }
        return nums.length;
    }
}