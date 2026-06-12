class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] res = new boolean[1001];
        List<Integer> arr = new ArrayList<>();
        for(int i:nums1) res[i] = true;
        for(int i:nums2) {
            if(res[i]) {
                arr.add(i);
                res[i]=false;
            }
        }
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}