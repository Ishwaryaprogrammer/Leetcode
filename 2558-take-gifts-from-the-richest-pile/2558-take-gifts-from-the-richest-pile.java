class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Long> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(long i:gifts){
            pq.add(i);
        }
        while(k>0){
            pq.add((long) Math.sqrt(pq.poll()));
            k--;
        }
        long sum=0;
        while(!pq.isEmpty()){
            sum+=pq.poll();
        }
        return sum;
        
    }
}