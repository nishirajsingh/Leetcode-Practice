class Solution {
    public boolean isP(int [] nums,int k,int mid){
        int cur = nums[0];
        int sc=1;
        for(int i:nums){
            if(Math.abs(cur-i)>=mid){
                cur=i;
                sc++;
            }
        }
        if(sc>=k)return false;
        return true;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l=1,r=Integer.MAX_VALUE;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(isP(position,m,mid))r = mid-1;
            else l=mid+1;
        }
        return r;
    }
}