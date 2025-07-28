class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int ans=0;
        for(String dir:commands){
            if(dir.equals("RIGHT")){
                ans++;
            }
            if(dir.equals("LEFT")){
                ans--;
            }
            if(dir.equals("UP")){
                ans-=n;
            }
            if(dir.equals("DOWN")){
                ans+=n;
            }
        }
        return ans;
    }
}