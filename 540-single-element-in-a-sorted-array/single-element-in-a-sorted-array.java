class Solution {
    public int singleNonDuplicate(int[] nums) {
        int c = 0;
        if(nums.length==1)return nums[0];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] !=nums[i+1]){
                if(c==0)return nums[i];
                else c = 0;
            }else c++;
        }
        return nums[nums.length-1];
    }
}