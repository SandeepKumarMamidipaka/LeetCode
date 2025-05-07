class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int []arr=new int[rectangles.length];
        for (int i = 0; i < rectangles.length; i++) {
            arr[i]=Math.min(rectangles[i][0],rectangles[i][1]);
        }
        // System.out.println(Arrays.toString(arr));
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        // System.out.println(max);
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (max==arr[i]){
                count++;
            }
        }
        return count;
    }
}
