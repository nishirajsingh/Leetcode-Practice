class Solution {
    public boolean canJump(int[] nums) {
        int i=0;
        int idx=0;
        int n = nums.length;
        while(i<n){
            if(idx<i)return false;
            idx = Math.max(idx,i+nums[i]);
            i++;
        }
        return true;
    }
}