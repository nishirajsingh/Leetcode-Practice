class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int n = nums.length;
        int mx = nums[0];
        for(int i=0;i<n;i++){
            mx = Math.max(mx,nums[i]);
            h.put(nums[i],i);
        }
        if(mx<=0) return 1;
        for(int i=1;i<mx;i++){

            if(!(h.containsKey(i))) return i;
        }
        return mx+1;

        
    }
}