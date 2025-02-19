class Solution {
    public int minimumOperations(int[] nums) {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        Stack<Integer> st=new Stack<>();
        for(int n:nums){
            if(n!=0)p.offer(n);
        }
        int count=0;
        System.out.println(p);
        while(!p.isEmpty()){
            int sub=p.poll();
            int s=p.size();
            count++;
            while(s>0){
                int pu=p.poll()-sub;
                if(pu!=0)st.push(pu);
                s--;
            }
            while(!st.isEmpty()){
                p.offer(st.pop());
            }
        }
        return count;
        
    }
}