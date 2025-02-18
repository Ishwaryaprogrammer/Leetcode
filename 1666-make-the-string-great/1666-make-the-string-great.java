class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            
            if( !st.isEmpty() && Character.isUpperCase(c) && st.peek()==Character.toLowerCase(c)){
                st.pop();
            } else if (!st.isEmpty() && Character.isLowerCase(c) && st.peek() == Character.toUpperCase(c)) {
                st.pop();
                }else{
                st.push(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.insert(0,st.pop());
        }
        return sb.toString();
    }
}