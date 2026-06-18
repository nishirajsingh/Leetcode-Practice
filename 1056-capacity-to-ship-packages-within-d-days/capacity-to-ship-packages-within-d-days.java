class Solution {
    public boolean isP(int[] nums,int k, int mid){
        int sc=1;
        int cur=mid;
        for(int i:nums){
            if(cur<i){
                sc++;
                cur=mid;
            }
            cur-=i;
        }
        if(sc<=k)return true;
        return false;
    } 
    public int shipWithinDays(int[] weights, int days) {
        int l=0,r=Integer.MAX_VALUE;
        for(int i:weights) l=Math.max(l,i);
        while(l<=r){
            int mid =l+(r-l)/2;
            if(isP(weights,days,mid)) r = mid-1;
            else l=mid+1;
        }
        return l;
    }
}