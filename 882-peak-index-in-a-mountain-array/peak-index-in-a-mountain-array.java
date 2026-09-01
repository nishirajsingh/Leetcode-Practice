class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 0, h =arr.length-1;
        int ans = 0;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(mid < arr.length-1 &&arr[mid+1]>arr[mid]){
                l = mid+1;
            }else {h = mid-1;
                ans = mid;}
        }
        return ans;
    }
}