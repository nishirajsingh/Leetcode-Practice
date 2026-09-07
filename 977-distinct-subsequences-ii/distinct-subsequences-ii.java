class Solution {
    public int distinctSubseqII(String s) {
        var MOD = 1_000_000_007L;
        var dp = new long[26];
        for (char ch : s.toCharArray()) {
            int i = ch - 'a';
            long t = 0;
            for (long c : dp) {
                t = (t+c)%MOD;
            }
            dp[i] = (t+1)%MOD;
        }
        long res = 0;
        for (long i : dp) {
            res = (res + i) % MOD;
        }
        return (int)res;  
    }
}