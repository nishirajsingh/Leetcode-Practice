class Solution {
    public int jump(int[] nums) {
        int i=0;
        int idx = 0;
        int j=0;
        int res = 0;
        while(i<nums.length-1){
            idx = Math.max(idx,i+nums[i]);
            if(j==i){
                res++;
                j=idx;
            }
            i++;
        }
        return res;
    }
}