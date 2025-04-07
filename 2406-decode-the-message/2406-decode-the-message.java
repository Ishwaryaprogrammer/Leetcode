class Solution {
    public String decodeMessage(String key, String message) {
        StringBuilder sb=new StringBuilder();
        String ke ="";
        for (int i = 0; i < key.length(); i++) {
            char ch = key.charAt(i);
            if (ke.indexOf(ch) == -1 && ch!=' ') {
                ke += ch;
            }
        }
        for(int i=0;i<message.length();i++){
            char m=' ';
            if(message.charAt(i)!=' '){
                m=(char) (ke.indexOf(message.charAt(i))+97);
            }
            sb.append(m);
        }
        return sb.toString();
    }
}