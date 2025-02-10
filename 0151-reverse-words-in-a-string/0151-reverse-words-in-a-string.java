class Solution {
    public String reverseWords(String s) {
        s=s.replaceAll("( )+"," ");
        StringBuilder sb=new StringBuilder();
        String[] arr=s.split(" ");
        int i;
        for(i=arr.length-1;i>=0;i--){
                sb.append(arr[i]);
                sb.append(" ");
        }
        return sb.toString().trim();
    }
}