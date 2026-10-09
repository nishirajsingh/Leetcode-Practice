class Solution {
    public int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            res = Math.max(res,nums[i]);
        }
        int max = 1,min =1;
        for(int i=0;i<nums.length;i++){
            int product = max*nums[i];
            max = Math.max(product,Math.max(min*nums[i],nums[i]));
            min = Math.min(product,Math.min(min*nums[i],nums[i]));
            res = Math.max(res,max);
        }
        return res;

    }
}