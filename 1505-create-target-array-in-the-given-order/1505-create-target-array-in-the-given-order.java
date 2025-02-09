class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        LinkedList<Integer> l=new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            l.add(index[i],nums[i]);
        }
        int[] arr=new int[l.size()];
        for(int i=0;i<nums.length;i++){
            arr[i]=l.get(i);
        }
    return arr;
    }

}