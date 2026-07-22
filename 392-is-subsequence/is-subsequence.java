class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0 && t.length()==0)return true;
        if(t.length()==0)return false;
        int j=0,i=0;
        while(i<s.length()&& j<t.length()){
            if(s.charAt(i)==t.charAt(j))i++;
            j++;
        }
        return i==s.length();
        
    }
}