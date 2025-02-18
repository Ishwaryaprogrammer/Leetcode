class Solution {
    public int calPoints(String[] operations) {
        Deque<String> st=new ArrayDeque<>();
        int num1,num2;
        for(String e:operations){
            
            if(e.equals("C")){
                
                st.pop();
                
            }else if(e.equals("+")){
                
                num1=Integer.parseInt(st.peek());
                String inc=st.pop();
                num2=Integer.parseInt(st.peek());
                st.push(inc);
                st.push(Integer.toString(num1+num2));
                
            }else if(e.equals("D")){
                
                st.push(Integer.toString(Integer.parseInt(st.peek())*2));
                
            }else{
                st.push(e);
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=Integer.parseInt(st.pop());
        }
        return sum;
        
    }
}