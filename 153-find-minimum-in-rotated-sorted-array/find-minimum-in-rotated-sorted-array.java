class Solution {
    public int findMin(int[] nums) {
        int p=0;
        int n = nums.length;
        int l = 0;
        int r = n-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[0]<=nums[mid]){
                p= mid;
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        if(p==n-1) return nums[0];
        else return nums[p+1];
    }
}