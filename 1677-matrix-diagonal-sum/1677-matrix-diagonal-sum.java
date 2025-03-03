class Solution {
    public int diagonalSum(int[][] mat) {
        int val=0,l=mat.length;
        if(l==1){return mat[0][0];}
        for(int i=0,j=l-1;i<l;i++,j--){
            val+=mat[i][i]+mat[j][i];
        }
        if(l%2!=0){
            val-=mat[l/2][l/2];
        }
        return val;
    }
}