class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int applecount=0;
        for(int i:apple){
            applecount+=i;
        }
        Arrays.sort(capacity);
        int tc=0;
        for(int i=capacity.length-1;i>=0;i--){
            tc+=capacity[i];
            if(applecount<=tc){
                return capacity.length-i;
            }
        }
        return 0;
    }
}
