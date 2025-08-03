class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String st=sb.toString();
        String[] ch=st.split(" ");
        String res="";
        for(int i=ch.length-1;i>0;i--){
            res+=ch[i];
            res+=" ";
        }
        res+=ch[0];
        return res;

    }
}