class Solution {
    public int[] finalPrices(int[] prices) {
        int res[]=new int[prices.length];
        int i=0;
        int j=i+1;
        while (i!= prices.length-1){
            if (prices[i]>=prices[j]){
                int k=prices[i]-prices[j];
                res[i]=k;
                i++;
                j=i+1;
            }
            else if (prices[i]<prices[j]){
                if (j== prices.length-1) {
                    res[i] = prices[i];
                    i++;
                    j=i+1;
                }
                else
                    j++;
            }
        }
        res[prices.length-1]=prices[prices.length-1];
        return res;
    }
}
