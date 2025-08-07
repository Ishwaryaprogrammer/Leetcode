class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)==ch){
                sb.append(word.charAt(i));
                if(sb.indexOf(String.valueOf(ch))!=0){
                    sb.reverse();
                }
            }
            else{
                sb.append(word.charAt(i));
            }
        }
        return sb.toString();
    }
}