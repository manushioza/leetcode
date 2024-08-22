class Solution {
    public boolean isValid(String s) {
    
        Stack<Character> st = new Stack();
        ArrayList<String> open =  new ArrayList<>();
        open.add("(");
        open.add("[");
        open.add("{");
        ArrayList<String> closed = new ArrayList<>();
        closed.add(")");
        closed.add("]");
        closed.add("}");
        

        for(int i = 0; i <= s.length() - 1; i++){
            if (open.contains(s.charAt(i) + "") || st.isEmpty()){
                st.push(s.charAt(i));
            }
            else{
                char top = st.peek();
                if(open.indexOf(top + "") == closed.indexOf(s.charAt(i) + "")){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }
            
        }
         return  st.isEmpty();
    }
}