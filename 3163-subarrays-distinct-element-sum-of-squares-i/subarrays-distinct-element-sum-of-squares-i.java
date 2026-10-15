class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum =0;
        for(int i=0;i<nums.size();i++){
            for(int j=i;j<nums.size();j++){
                Set<Integer> temp2 = new HashSet<>();
                for(int k=i;k<=j;k++){
                temp2.add(nums.get(k));
                }
                sum+=(temp2.size()* temp2.size());
            }
        }
        return sum;
    }
}