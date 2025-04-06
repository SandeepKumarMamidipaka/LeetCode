class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> queue= new PriorityQueue<>(Collections.reverseOrder());
        for (int i:gifts){
            queue.add(i);
        }
        // System.out.println(queue);
        for (int i=1;i<=k;i++){
            int f=(int) Math.sqrt(queue.peek());
            queue.poll();
            queue.add(f);
        }
        // System.out.println(queue);
        long res=0;
        for (int i:queue){
            res+=i;
        }
        
        return res;
    }
}
