class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=Math.abs(i-s.indexOf(t.charAt(i)));
        }
        return sum;
    }
}