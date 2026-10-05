class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(char ch:s.toCharArray()){
            if(ch == '('){
                st.push(0);
            }else{
                int a = st.pop();
                int b = st.pop();
                st.push(b+Math.max(2*a,1));
            }
        }
        return st.pop();
    }
}