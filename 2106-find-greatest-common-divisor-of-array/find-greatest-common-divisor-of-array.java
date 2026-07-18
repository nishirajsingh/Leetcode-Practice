class Solution {
    public int GCD(int a,int b){
        if(b==0)return a;
        return GCD(b,a%b);
    }
    public int findGCD(int[] nums) {
        int mx = Integer.MIN_VALUE;
        int mi = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            mx = Math.max(mx,nums[i]);
            mi = Math.min(mi,nums[i]);
        }
        return GCD(mi,mx);
    }
}