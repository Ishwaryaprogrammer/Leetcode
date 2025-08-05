class Solution {
    public int findFinalValue(int[] nums, int original) {
        List<Integer> li= new ArrayList<>();
        for(int i:nums){
            li.add(i);
        }
        while(li.contains(original)){
            original*=2;
        }
        return original;
    }
}