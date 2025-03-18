class Solution {
    public int countKDifference(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=nums[i]+k;int sub=nums[i]-k;
            for(int j=i+1;j<nums.length;j++){
                if(sum==nums[j] || sub==nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}