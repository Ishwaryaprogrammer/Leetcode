class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr=new int[2];int i;
        for(i=0;i<nums.length;i++){
            if(nums[i]==target){
                break; 
            }
        }
        if(i==nums.length){
            arr[0]=-1;
            arr[1]=-1;
            return arr;
        }
        arr[0]=i;
        arr[1]=i;
        while(i<nums.length-1 && nums[i+1]==target ){
            i++;
        }
        arr[1]=i;
        return arr;
    }
}