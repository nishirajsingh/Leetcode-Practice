class Solution {
    public boolean isP(int []nums,long k,long mid){
        long cur=0;
        for(int i:nums){
            cur+=(i/mid);
        }
        if(cur>=k)return false;
        return true;
    }
    public int maximumCandies(int[] candies, long k) {
        long l=1,r=(long)10e7;
        while(l<=r){
            long mid = l+(r-l)/2;
            if(isP(candies,k,mid)) r=mid-1;
            else l=mid+1;
        }
        return (int) r;
    }
}