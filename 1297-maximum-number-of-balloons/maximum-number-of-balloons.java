class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] cnt = new int[26];
        for(int i=0;i<text.length();i++){
            cnt[text.charAt(i)-'a']++;
        }
        int b = cnt['b' - 'a'];
        int a = cnt['a' - 'a'];
        int l = cnt['l' - 'a']/2;
        int o = cnt['o' - 'a']/2;
        int n = cnt['n' - 'a'];
        
        return Math.min(b,Math.min(a,Math.min(l,Math.min(o,n))));
    }
}