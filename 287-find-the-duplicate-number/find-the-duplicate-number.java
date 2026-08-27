class Solution {
    public boolean isP(int[] nums,int mid){
        int c = 0;
        for(int i:nums){
            if(i<=mid)c++;
        }
        return c>mid;
    }
    public int findDuplicate(int[] nums) {
        int l = 1,h = nums.length-1;
        while(l<h){
            int mid = l+(h-l)/2;
            if(isP(nums,mid)){
                h = mid;
            }else{
                l= mid+1;
            }
        }
        return l;
    }
}