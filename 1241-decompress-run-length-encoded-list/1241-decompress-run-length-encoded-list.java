class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i+=2){
            for(int j=0;j<nums[i];j++){
                l.add(nums[i+1]);
            }
        }
        int[] arr=new int[l.size()];
        for(int i=0;i<l.size();i++){
            arr[i]=l.get(i);
        }
        return arr;
    }
}