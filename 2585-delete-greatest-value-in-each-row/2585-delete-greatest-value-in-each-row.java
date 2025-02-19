class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for (int[] num : grid) {
            Arrays.sort(num);
        }
        int z=0,sum=0;
        while(z<grid[0].length){
            int max=0;
            for(int i=0;i<grid.length;i++){
                max=Math.max(grid[i][z],max);
            }
            sum+=max;
            z++;
        }
        return sum;
    }
}