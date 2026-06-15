class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] c = new int[1001];
        for (int x : nums1) {
            c[x]++;
        }
        List<Integer> res = new ArrayList<>();
        for (int i : nums2) {
            if (c[i]-- > 0) {
                res.add(i);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}