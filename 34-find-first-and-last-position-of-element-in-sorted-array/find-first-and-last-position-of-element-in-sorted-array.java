class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a=-1,b=-1,l=0,h=nums.length-1;
        while(l<=h){
            int mid = l+(h-l)/2; 
            if(nums[mid]<target)l = mid+1;
            else h = mid-1;
        }
        a = l;
        l=0;
        h = nums.length-1;
        while(l<=h){
            int mid = l+(h-l)/2; 
            if(nums[mid]<=target)l = mid+1;
            else h = mid-1;
        }
        b= l-1;
        if(a<nums.length && a<=b && nums[a]==target) {
            return new int[]{a, b};
        }
        return new int[]{-1, -1};
    }
}