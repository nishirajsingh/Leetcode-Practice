class Solution {
    int[] coins;
    int k;
    public long lcm(long a, long b) {
        return a*b/gcd(a, b);
    }
    public long gcd(long a, long b) {
        return b==0?a:gcd(b, a % b);
    }
    public boolean isPossible(long mx) {
        long c=0;
        int n=coins.length;
        for(int i=1;i<(1<<n);i++) {
            long v = 1;
            for(int j=0;j<n;j++) {
                if((i>>j&1) == 1) {
                    v=lcm(v,coins[j]);
                    if(v>mx) break;
                }
            }
            int m = Integer.bitCount(i);
            if(m%2 == 1) c+=mx/v;
            else c-=mx/v;
        }
        return c>=k;
    }
    public long findKthSmallest(int[] coins, int k) {
        this.coins = coins;
        this.k = k;
        long l=1,h=(long)1e11;
        while(l<h){
            long mid=(l+h)>>1;
            if(isPossible(mid)){
                h=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
    }

}