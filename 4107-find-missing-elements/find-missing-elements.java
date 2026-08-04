class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();
        boolean[] freq = new boolean[101];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
            freq[nums[i]] = true;
        }
        for(int i = min;i<max;i++){
            if(!freq[i]){
                res.add(i);
            }
        }
        return res;
        
    }
}