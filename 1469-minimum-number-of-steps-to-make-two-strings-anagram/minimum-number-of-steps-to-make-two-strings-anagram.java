class Solution {
    public int minSteps(String s, String t) {
        int[] cs = new int[26];
        int[] ct = new int[26];
        int res=0;
        for(int i=0;i<s.length();i++){
            cs[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            ct[t.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            res+=Math.abs(cs[i]-ct[i]);
        }
        return res/2;
    }
}