class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        // HashMap<String,Integer> map=new Hashmap<>(){
        //     "UP"=1;
        //     "DOWN"=3

        // }
        int res=0;
        for(String s:commands){
            if(s.equals("UP")){
                res-=n;
            }
            else if(s.equals("RIGHT")){
                res+=1;
            }
            else if(s.equals("DOWN")){
                res+=n;
            }
            else{
                res-=1;
            }
        }
        return res;
    }
}