class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>(); 
        for(char c:s.toCharArray()){
            if(!st.isEmpty() && c==st.peek()){
                st.pop();
            }else{
                st.push(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty())
        {
            sb.insert(0,st.pop());
        }
        return sb.toString();
    }
}