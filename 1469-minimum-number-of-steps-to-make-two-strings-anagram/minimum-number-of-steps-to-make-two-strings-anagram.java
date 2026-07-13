class Solution {
    public int minSteps(String s, String t) {
        int[] a = new int[26];
        int res=0;
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++) {
            a[t.charAt(i)-'a']--;
            if(a[t.charAt(i)-'a']<0)res++;
        }
        return res;
    }
}