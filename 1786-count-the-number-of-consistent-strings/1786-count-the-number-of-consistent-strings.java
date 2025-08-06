class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(String s:words){
            int i;
            for(i=0;i<s.length();i++){
                if(!allowed.contains(String.valueOf(s.charAt(i)))){
                    break;
                }
            }
            if(i==s.length()){
                count++;
            }
        }
        return count;
    }
}