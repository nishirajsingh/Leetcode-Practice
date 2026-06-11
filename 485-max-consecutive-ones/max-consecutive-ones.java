class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c1 = 0,c2 = 0;
        for (int n : nums) {
            if (n==1) {
                c2++;
                c1 = Math.max(c1, c2);
            } else {
                c2 = 0;
            }
        }
        
        return c1;
    }
}