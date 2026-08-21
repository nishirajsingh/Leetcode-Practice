class Solution {
    public boolean isP(int[] nums,int k, int mid){
        int currd =1;
        int s=0;
        for(int i:nums){
            if(s+i<=mid){
                s+=i;
            }else{
                currd++;
                s=i;
            }
        }
        return currd<=k;

    } 
    public int shipWithinDays(int[] weights, int days) {
        int l=0,h=0;
        for(int i:weights){
            l= Math.max(l,i);
            h+=i;
        } 
        int ans = 0;
        while(l<=h){
            int mid =l+(h-l)/2;
            if(isP(weights,days,mid)){
                ans = mid;
                h = mid-1;
            } 
            else l=mid+1;
        }
        return ans;
    }
}