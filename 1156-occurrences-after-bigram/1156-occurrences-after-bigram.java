class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String res="";int z=0;
        String[] str=text.split(" ");
        for(int i=0;i<str.length-2;i++){
            if(first.equals(str[i]) && second.equals(str[i+1])  ){
                    res+=str[i+2];
                    res+=" ";
                
            }
        }
        if(res.length()==0)return new String[0];
        return res.split(" ");
    }
}