class Solution {
    public int[] countBits(int n) {
        int[] res=new int[n+1];
        int count,temp;
        for(int i=0;i<=n;i++){
            count=0;temp=i;
            while(temp>0){
                if((temp&1)==1) {
                    count++;
                }
                temp>>=1;
            }
            res[i]=count;
        }
        return res;
    }
}