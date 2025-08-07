class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> li=new ArrayList<>();
        int i=0;
        int n=nums.length;
        while(i<n){
            int start = i;
            while(i+1 < n && nums[i+1]==nums[i]+1){
                i++;
            }
            if(start==i){
                li.add(String.valueOf(nums[i]));
            }
            else{
                li.add(String.valueOf(nums[start] +"->"+nums[i]));
            }
            i++;
        }
        return li;


    }
}