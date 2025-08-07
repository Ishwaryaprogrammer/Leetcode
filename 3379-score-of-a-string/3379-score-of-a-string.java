class Solution {
    public int scoreOfString(String s) {
        int output=0;
        for (int i=0; i<s.length()-1; i++){
            int a = (int) s.charAt(i);
            int b = (int) s.charAt(i+1);
            output += Math.abs(a-b);
        }
        return output;
    }
}