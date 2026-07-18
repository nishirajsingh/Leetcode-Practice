class Solution {
    public int rev(int n){
        int r = 0;
        while(n!=0){
            int d =n%10;
            r = r*10+d;
            n/=10;
        }
        return r;
    }
    public int countDistinctIntegers(int[] nums) {
        boolean[] c = new boolean[1000001];
        int cnt = 0;
        for(int i=0;i<nums.length;i++){
            if(!c[nums[i]]){
                cnt++;
                c[nums[i]]=true;
            }
            int r = rev(nums[i]);
            if(!c[r]){
                cnt++;
                c[r]=true;
            }
        }
        return cnt;
    }
}