class Solution {
    public int maxDistinct(String s) {
        boolean [] a = new boolean[26];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']=true;
        }
        int c=0;
        for(int i=0;i<26;i++){
            if(a[i])c++;
        }
        return c;
    }
}