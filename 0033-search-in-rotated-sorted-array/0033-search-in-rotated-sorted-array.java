class Solution {
    public int search(int[] nums, int target) {
        if((nums.length==1 && nums[0]==target)||nums[0]==target){
            return 0;
        }
        if(nums.length==1){
            return -1;
        }
        int val=nums[0];
        boolean flag=true;
        if(target<0){
            flag=false;
        }
        if(target<val && flag){
            int start=nums.length-1-((val-target)%nums.length+1);
            System.out.println(start);
            System.out.println(start);
            
            for(int i=nums.length-1;i>=start-val;i--){
                System.out.println(i);
                if(i>=0 && nums[i]==target ){
                    return i;
                }
                
            }   
        }else{
            for(int i=0;i<nums.length;i++){
                if(nums[i]==target){
                    return i;
                }
            }
        }

        return -1;
    }
}