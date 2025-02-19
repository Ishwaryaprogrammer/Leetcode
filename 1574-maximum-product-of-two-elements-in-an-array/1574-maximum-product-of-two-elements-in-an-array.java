class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> p=new  PriorityQueue<>(Collections.reverseOrder());
        for (int num : nums) {
            p.add(num);
        }
        return (p.poll()-1)*(p.poll()-1);
    }
}