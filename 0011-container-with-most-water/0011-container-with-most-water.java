class Solution {
    public int maxArea(int[] height) {
        int area=0;int i=0,j=height.length-1,left,right;
        while(i<j){
            left=height[i];
            right=height[j];
            area=Math.max(area,Math.min(height[i],height[j])*Math.abs(i-j));
            if(left>right){
                j--;
            }else{
                i++;
            }
        }
        return area;
    }
}