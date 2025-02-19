import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        // Add non-zero elements to the priority queue
        for (int n : amount) {
            if (n > 0) pq.offer(n);
        }

        int time = 0;
        
        // Process while at least two elements exist
        while (pq.size() > 1) {
            int first = pq.poll();   // Largest
            int second = pq.poll();  // Second largest

            time++; // Fill both cups

            if (--first > 0) pq.offer(first);
            if (--second > 0) pq.offer(second);
        }
        
        // If one element remains, add its value to time
        if (!pq.isEmpty()) {
            time += pq.poll();
        }

        return time;
    }
}
