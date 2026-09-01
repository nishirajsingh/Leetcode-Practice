class Solution {
    public int findPeakElement(int[] nums) {
        int l=0,h=nums.length-1;
        int ans =0;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(mid<nums.length-1 && nums[mid]<nums[mid+1]) l = mid+1;
            else{
                ans = mid;
            h= mid-1;
            } 
        }
        return ans;
            
    }
}