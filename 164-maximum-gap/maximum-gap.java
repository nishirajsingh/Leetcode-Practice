class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(n<2) return 0;
        int mx =0;
        for(int i=0;i<n-1;i++){
            mx = Math.max(Math.abs(nums[i]-nums[i+1]),mx);
        }
        return mx;
    }
}