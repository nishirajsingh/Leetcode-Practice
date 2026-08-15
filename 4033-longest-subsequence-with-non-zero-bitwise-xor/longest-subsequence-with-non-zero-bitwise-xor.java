class Solution {
    public int longestSubsequence(int[] nums) {
        boolean flag = false;
        int xor = 0;
        for(int i : nums){
            xor^=i;
            if(i != 0) flag = true;
        }
        if(xor != 0) return nums.length;
        return flag ? nums.length-1 : 0;
    }
}