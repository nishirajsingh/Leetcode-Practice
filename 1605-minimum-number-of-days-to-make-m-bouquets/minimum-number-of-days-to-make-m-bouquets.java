class Solution {
    public boolean isPossible(int mid, int[] a,int m,int k){
        int t =0;
        int c = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]<=mid)c++;
            else {
                t +=c/k;
                c=0;
            }
        }
        t+=c/k;
        if(t<m)return false;
        return true;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int min=Integer.MAX_VALUE;
        int mx = 0;
        if((long)m*k>bloomDay.length)return -1;
        for(int i=0;i<bloomDay.length;i++){
            mx = Math.max(bloomDay[i],mx);
            min = Math.min(bloomDay[i],min);
        }
        int ans =mx;
        int l = min;
        int h = mx;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(isPossible(mid, bloomDay,m,k)){
                ans= mid;
                h= mid-1;
            }
            else l = mid+1;
        }
        return ans;
    }
}