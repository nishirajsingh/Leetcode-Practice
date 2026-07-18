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
        Set<Integer>s = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
            s.add(rev(nums[i]));
        }
        return s.size();
    }
}