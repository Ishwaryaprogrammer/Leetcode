class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,(map.getOrDefault(i,0)+1));
        }
        int max=0,tot=0;
        for(int j:map.values()){
            if(j>max){
                max=j;
                tot=0;
            }else if(j==max){
                tot+=j;
            }
        }
        return max+tot;
    }
}