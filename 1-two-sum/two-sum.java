class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer,Integer> res = new HashMap<>();
        for(int i=0;i<n;i++){
            int c = target-nums[i];
            if(res.containsKey(c)){
                return new int[]{res.get(c),i};
            }
            res.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}