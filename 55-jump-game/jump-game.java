class Solution {
    public boolean canJump(int[] nums) {
        int idx=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(idx<i) return false;
            idx=Math.max(idx,i+nums[i]);
        }
        return true;
    }
}