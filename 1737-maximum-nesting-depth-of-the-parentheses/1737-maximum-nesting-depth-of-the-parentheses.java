class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        int max=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                st.push('(');
                max=Math.max(st.size(),max);
            }else if(c==')'){
                st.pop();
            }
        }
        return max;
    }
}