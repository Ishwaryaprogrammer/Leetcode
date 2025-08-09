class Solution {
    public int minOperations(String[] logs) {
        int x=0;
        for(String s:logs){
            if(s.equals("../")){
                if(x>0){
                    x--;
                }
            }else if(s.equals("./")){
                
            }else{
                x++;
            }
        }
        return x;
    }
}