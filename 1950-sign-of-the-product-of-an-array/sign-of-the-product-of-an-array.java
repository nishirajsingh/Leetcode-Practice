class Solution {
    public int arraySign(int[] nums) {
        int p = 0;
        for(int n : nums) {
            if (n==0) {
                return 0; 
            }
            if (n<0) {
                p++;
            }
        }
        return (p%2==1)?-1:1;
    }
}