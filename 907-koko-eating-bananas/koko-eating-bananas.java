class Solution {
    public boolean isPossible(int m,int[] piles, int he){
        long sum = 0;
        for(int i:piles){
            sum+=(i+m-1)/m;
        }
        return sum<=he;

    }
    public int minEatingSpeed(int[] piles, int he) {
        int mx = 0;
        for(int i=0;i<piles.length;i++)mx = Math.max(mx,piles[i]);
        int l = 1;
        int h = mx;
        while(l<h){
            int mid = l+(h-l)/2;
            if(isPossible(mid,piles,he))h=mid;
            else l=mid+1;
        }
        return l;
    }
}