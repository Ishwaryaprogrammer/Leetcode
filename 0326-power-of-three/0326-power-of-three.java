class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }else{
            double nn=n;
            while(nn>1){
                nn/=3;
            }
            if(nn==1){
                return true;
            }return false;
        }
    }
}