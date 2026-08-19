class Solution {
    public boolean isPossible(int m, int[]n,int t){
        long sum = 0;
        for(int i= 0;i<n.length;i++){
            sum+=(n[i]+m-1)/m;
        }
        return sum<=t;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int l =1;
        int mx = 0;
        for(int i =0;i<nums.length;i++){
            mx = Math.max(mx,nums[i]);
        }
        int h = mx;
        while(l<h){
            int mid = l+(h-l)/2;
            if(isPossible(mid,nums,threshold))h = mid;
            else l = mid+1;
        }
        return l;
    }
}