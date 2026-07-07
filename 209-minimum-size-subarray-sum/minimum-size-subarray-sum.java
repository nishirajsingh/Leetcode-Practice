class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int j=0;
        long s=0;
        int ans=n+1;
        for(int i=0;i<n;i++) {
            s += nums[i];
            while(s>=target) {
                ans = Math.min(ans, i-j+1);
                s -= nums[j++];
            }
        }
        System.gc();
        if(ans>n) return 0;
        return ans;
    }
}