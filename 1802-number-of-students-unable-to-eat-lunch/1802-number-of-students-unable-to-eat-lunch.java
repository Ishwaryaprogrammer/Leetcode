class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int i=0,j=0;
        Deque<Integer> q=new ArrayDeque<>();
        while(i<students.length){
            if(students[i]==sandwiches[j]){
                i++;j++;
            }else{
                q.offer(students[i]);
                i++;
            }
        }
        int count=0;
        while(count<q.size()){
            if(q.peek()==sandwiches[j]){
                q.poll();
                j++;
                count=0;
            }else{
                q.offer(q.pop());
                count++;
            }
        }
        return count;
        
    }
}