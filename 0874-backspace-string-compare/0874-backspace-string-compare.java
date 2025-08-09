class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='#'){
                if(!s1.isEmpty()){s1.pop();}
            }else{
                s1.push(ch);
            }
        }
        Stack<Character> s2=new Stack<>();
        for(char ch:t.toCharArray()){
            if(ch=='#'){
                if(!s2.isEmpty()){s2.pop();}
            }else{
                s2.push(ch);
            }
        }
        if(s1.isEmpty() && s2.isEmpty()){return true;}
        if(s1.toString().equals(s2.toString())){
            return true;
        }else{
          return false;
        }   
    }
}