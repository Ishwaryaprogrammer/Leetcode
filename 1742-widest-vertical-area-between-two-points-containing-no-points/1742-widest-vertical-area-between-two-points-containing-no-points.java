class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] res=new int[points.length];int j=0;
        for(int[] i:points){
            res[j++]=i[0];
        }
        Arrays.sort(res);
        int diff=0;
        for(int k=1;k<res.length;k++){
            diff=Math.max(diff,res[k]-res[k-1]);
        }
        return diff;
    }
}