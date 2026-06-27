class Solution {
    public int maximumLength(int[] nums) {
        Map<Long, Integer> m = new HashMap<>();
        for (int x : nums) {
            m.put((long)x,(m.getOrDefault((long)x, 0) + 1));
        }
        Integer t = m.remove(1L);
        int ans = (t==null) ? 0:t-(t%2^1);
        for (long x : m.keySet()) {
            t = 0;
            while (m.getOrDefault(x, 0) > 1) {
                x = x * x;
                t += 2;
            }
            t += m.getOrDefault(x, -1);
            ans = Math.max(ans, t);
        }
        return ans;



    }
}