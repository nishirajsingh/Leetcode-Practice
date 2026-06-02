class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count=0;
        int sum=0;
        int[] b=new int[k];
        b[0]=1;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int c=((sum%k)+k)%k;
            count+=b[c];
            b[c]++;
        }
        return count;
    }
}