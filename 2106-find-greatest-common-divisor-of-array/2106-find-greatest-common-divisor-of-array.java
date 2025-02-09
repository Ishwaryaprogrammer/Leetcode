class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max=min;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        if(max%min==0){
            return min;
        }
        for(int j=min-1;j>1;j--){
            if(min%j==0 && max%j==0){
                return j;
            }
        }
        return 1;
    }
}