class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] temp=Arrays.copyOf(score,score.length);
        String[] res=new String[score.length];
        // System.out.println(Arrays.toString(score));
        // System.out.println(Arrays.toString(temp));
        Arrays.sort(temp);
        // System.out.println(Arrays.toString(score));
        // System.out.println(Arrays.toString(temp));

        int c=1;
        for (int i= temp.length-1;i>=0;i--){
            for (int j=0;j< temp.length;j++){
                if (temp[i]==score[j]){
                    if (c==1){
                        res[j]="Gold Medal";
                    }
                    else if (c==2){
                        res[j]="Silver Medal";
                    }
                    else if (c==3)
                    {
                        res[j]="Bronze Medal";
                    }
                    else{
                        res[j]=c+"";
                    }
                    c++;
                }
            }
        }
        return res;
    }
}
