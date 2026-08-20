class Solution {
    public boolean isPossible(int m, int[]n,double t){
        double sum = 0;
        for(int i= 0;i<n.length-1;i++){
            sum+=Math.ceil((double)n[i]/m);
        }
        sum+=(double)n[n.length-1]/m;
        return sum<=t;
    }
    public int minSpeedOnTime(int[] dist, double hour) {
        int l = 1;
        int h = 10000000;
        int ans = -1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(isPossible(mid,dist,hour)){
                ans = mid;
                h = mid-1;
            }
            else l = mid+1;
        }
        return ans;
    }
}