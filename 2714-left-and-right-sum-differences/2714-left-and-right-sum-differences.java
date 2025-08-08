class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sum = 0;
        int[] ls=new int[nums.length];     
        for(int i=0; i<nums.length; i++){
            ls[i] = sum;
            sum = sum + nums[i]; 
        }
        sum = 0;
        int[] rs=new int[nums.length]; 
        for(int i=nums.length-1; i>=0; i--){
            rs[i] = sum;
            sum = sum + nums[i]; 
        }
        for(int i=0; i<nums.length; i++){
            nums[i] = Math.abs(ls[i]-rs[i]);
        }
        return nums;
    }
}