class Solution {
    public int minStartValue(int[] nums) {
        int p = 0, mi = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            p+=nums[i];
            mi = Math.min(p,mi);
        }
        return Math.max(1,1-mi);
    }
}