class Solution {
    public int dominantIndex(int[] nums) {
        int maxa= nums[0],maxi=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxa){
                maxi=i;
                maxa=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==maxa) continue;
            if(nums[i]*2>maxa) return -1;
        }
        return maxi;
    }
}