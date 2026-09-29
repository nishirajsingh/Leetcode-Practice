class Solution {
    public boolean isP(int[] nums,int k, int mid){
        int curr = 0;
        int temp =1;
        for(int i:nums){
            if(curr+i<=mid){
                curr+=i;
            }else{
                curr=i;
                temp++;
            }
        }
        return temp<=k;

    } 
    public int shipWithinDays(int[] weights, int days) {
        int l=0;
        int h=0;
        for(int i:weights){
            l= Math.max(l,i);
            h+=i;
        }
        int ans = 0;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(isP(weights,days,mid)){
                ans = mid;
                h = mid-1;
            }
            else l = mid+1;
        }
        return ans;

    }
}