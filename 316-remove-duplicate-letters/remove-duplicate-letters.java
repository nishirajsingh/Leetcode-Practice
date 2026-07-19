class Solution {
    public String removeDuplicateLetters(String s) {
        int[] a = new int[26];
        boolean[] v = new boolean[26];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
        }
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            a[c-'a']--;
            if(v[c-'a'])continue;
            while(!st.isEmpty() && st.peek()>c && a[st.peek()-'a']>0){
                v[st.pop()-'a']=false;
            }
            st.push(c);
            v[c-'a']=true;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<st.size();i++){
            sb.append(st.get(i));
        }
        return sb.toString();
    }
}