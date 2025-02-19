class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> p=new  PriorityQueue<>();

        for (int num : nums) {
            p.add(num);
        }
        int[] res=new int[nums.length];
        int i,j,z=0;
        while(!p.isEmpty()){
            i=p.poll();
            j=p.poll();
            res[z++]=j;
            res[z++]=i;
        }
        return res;
    }
}