class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length];
        int z=0;
        for(int i:nums1){
            int x=-1;boolean flag=false;
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==i){
                    flag=true;
                }
                if(flag && i<nums2[j]){
                    x=nums2[j];
                    break;
                }
            }
            res[z++]=x;
        }
        return res;
    }
}