class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        for(char i:stones.toCharArray()){
            String ch=String.valueOf(i);
            if (jewels.contains(ch)){
                ans++;
            }
        }
        return ans;
    }
}