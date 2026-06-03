class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0, maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            maxsum=maxsum<sum?sum:maxsum;
            sum=sum<0?0:sum;
        }
        return maxsum;
    }
}