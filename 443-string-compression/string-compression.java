class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int idx=0;
        for(int i=0;i<n;i++){
            char ch = chars[i];
            int c=0;
            while(i<n && chars[i]==ch){
                c++;i++;
            }
            chars[idx]=ch;
            idx++;
            
            if(c>1){
                String s = Integer.toString(c);
                for(int j=0;j<s.length();j++){
                    chars[idx]=s.charAt(j);
                    idx++;
                }
            }i--;
        }
        return idx;
    }
}