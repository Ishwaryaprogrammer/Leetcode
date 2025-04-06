class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int[] arr=new int[nums.length];
        int ans=999,i=0,j=0;
        while(i<nums.length-1){
            if(nums[i]==nums[i+1] && ans!=nums[i+1]){
                arr[j]=nums[i];ans=nums[i+1];j++;
            }
            i++;
        }
        int[] arr2=Arrays.copyOf(arr, j);;
        return arr2;
    }
}