class Solution {
    public int numberOfBeams(String[] bank) {
        int res=0;
        int prev=0;
        for(String s:bank){
            int count=0;
            for(char ch:s.toCharArray()){
                if(ch=='1'){
                    count++;
                }
            }
            if(count>0){
                res+=prev*count;
                prev=count;
            }
        }
        return res;
    }
}