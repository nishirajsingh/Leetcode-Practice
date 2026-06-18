class Solution {
    public boolean isP(int []nums,int k , int mid){
        int stcnt = 1;
        int cur = 0;
        for(int i:nums){
            if(i>mid) return false;
            if(i+cur<=mid) cur+=i;
            else{
                stcnt++;
                cur=i;
            }

        }
        if(stcnt>k) return false;
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int l=0,r=0;
        for(int i:nums)r+=i;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(isP(nums,k,mid)) r=mid-1;
            else l=mid+1;
        }
        return l;

    }
}