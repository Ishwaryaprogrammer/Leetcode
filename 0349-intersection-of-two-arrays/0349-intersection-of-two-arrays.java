class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1= new HashSet<>();
        Set<Integer> s2= new HashSet<>();
        for(int i:nums1){
            s1.add(i);
        }
        for(int j:nums2){
            if(s1.contains(j)){
                s2.add(j);
            }   
        }
        int[] res=new int[s2.size()];
        int z=0;
        for(int i:s2){
            res[z++]=i;
        }
        return res;
    }
}