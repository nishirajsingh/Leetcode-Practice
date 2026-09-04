class Solution {
    boolean isPossible(long m,int t){
        return (long)(m*(m+1)/2)>=t;
    }
    public int reachNumber(int target) {
        long l=1,h=Long.MAX_VALUE;
        long ans = h;
        target = Math.abs(target);
        while(l<=h){
            long mid = l+(h-l)/2;
            if(isPossible(mid,target)){
                ans = mid;
                h = mid-1;
            }else l= mid+1;
        }
        long sum = ans*(ans+1)/2;
        while((sum-target)%2!=0){
            ans++;
            sum+=ans;
        }
        return (int)ans;

    }
}