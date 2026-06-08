class Solution {
    public int minCost(int[] nums1, int[] nums2) {
        Map<Integer, Integer> c2 = new HashMap<>();
        for (int x:nums2) {
            c2.merge(x,1,Integer::sum);
        }
        Map<Integer, Integer> c1 = new HashMap<>();
        for (int x:nums1) {
            int c=c2.getOrDefault(x, 0);
            if (c>0) {
                c2.put(x,c-1);
            } else {
                c1.merge(x,1,Integer::sum);
            }
        }
        int ans=0;
        for (int v:c1.values()) {
            if ((v&1) == 1) {
                return -1;
            }
            ans += v/2;
        }
        for (int v:c2.values()) {
            if ((v&1) == 1) {
                return -1;
            }
        }

        return ans;
    }
}