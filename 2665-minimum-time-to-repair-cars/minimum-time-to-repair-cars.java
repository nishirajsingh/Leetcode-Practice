class Solution {
    public boolean isPossible(long m,int[]r, int c){
        long s = 0;
        for(int i:r){
            s+=(long)Math.sqrt(m/i);
        }
        return s>=c;
    }
    public long repairCars(int[] ranks, int cars) {
        int min= Integer.MAX_VALUE;
        int mx= Integer.MIN_VALUE;
        for(int i:ranks){
            mx = Math.max(mx,i);
            min = Math.min(min,i);
        }
        long l = 1;
        long h = (long) min*cars*cars;
        long ans = h;
        while(l<=h){
            long mid = l+(h-l)/2;
            if(isPossible(mid,ranks,cars)){
                ans= mid;
                h = mid-1;
            }else l = mid+1;
        }
        return ans;
        
    }
}