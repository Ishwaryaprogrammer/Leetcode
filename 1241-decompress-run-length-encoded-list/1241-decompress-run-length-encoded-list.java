class Solution {
    public int[] decompressRLElist(int[] nums) {
        int l=0;
        for(int i=0;i<nums.length-1;i+=2){
            l+=nums[i];
        }
        int[] arr=new int[l];int z=0;
        for(int i=0;i<nums.length;i+=2){
            while(nums[i]-->0){
                arr[z++]=nums[i+1];
            }
        }
        return arr;
    }
}