class Solution {
    public int differenceOfSums(int n, int m) {
        int nondiv=0,div=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                div+=i;
            }else{
                nondiv+=i;
            }
        }
        return nondiv-div;
    }
}