class Solution {
    public String removeOccurrences(String s, String part) {
        int in=s.indexOf(part);;
        while(in!=-1){
            s=s.replaceFirst(part,"");
            in=s.indexOf(part);
        }
        return s;
    }
}