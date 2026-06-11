class Solution {
    public int majorityElement(int[] nums) {
        int c=0, m=0;
        for (int i : nums) {
            if (c==0) {
                m=i;
                c=1;
            } else c+=(m==i)?1:-1;
        }
        return m;
    }
}