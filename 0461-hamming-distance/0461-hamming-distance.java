class Solution {
    public int hammingDistance(int x, int y) {
        int res=x^y,count=0;
        while(res>0){
            if((res&1)==1) {
                count++;
            }
            res>>=1;
        }
        return count;
    }
}