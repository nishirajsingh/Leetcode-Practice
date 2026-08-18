class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> count = new HashMap<>();
        for (int x : nums) count.put(x, count.getOrDefault(x, 0) + 1);

        if (k == 1) {
            int max = -1;
            for (int x : count.keySet()) if (count.get(x) == 1) max = Math.max(max, x);
            return max;
        }
        if (k == n) {
            int max = -1;
            for (int x : nums) max = Math.max(max, x);
            return max;
        }

        int ans = -1;
        if (count.get(nums[0]) == 1) ans = Math.max(ans, nums[0]);
        if (count.get(nums[n - 1]) == 1) ans = Math.max(ans, nums[n - 1]);
        return ans;
    }
}