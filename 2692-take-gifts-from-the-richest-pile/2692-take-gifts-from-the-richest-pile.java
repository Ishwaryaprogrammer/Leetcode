class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        for(int g:gifts){
            p.offer(g);
        }
        int val;long ans=0;
        while(k>0){
            val=(int) Math.floor(Math.sqrt(p.poll()));
            p.offer(val);
            k--;
        }
        while(!p.isEmpty()){
            ans+=p.poll();
        }
        return ans;
    }
}