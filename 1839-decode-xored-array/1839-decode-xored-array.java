class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] res=new int[encoded.length+1];
        int j=-1;
        res[++j]=first;
        for(int i=0;i<encoded.length;i++){
            res[++j]=res[i]^encoded[i];
        }
        return res;
    }
}