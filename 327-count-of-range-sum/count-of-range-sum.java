class Solution {
    public int lowerBound(List<Long> arr, long target) {
        int l = 0,h = arr.size();
        while(l<h) {
            int mid = l+(h-l)/2;
            if(arr.get(mid)>=target)h = mid;
            else l = mid+1;
        }
        return l;
    }
    public int upperBound(List<Long> arr, long target) {
        int l=0,h=arr.size();
        while(l<h){
            int mid = l+(h-l)/2;
            if(arr.get(mid)>target)h = mid;
            else l = mid + 1;
        }
        return l;
    }
    public int countRangeSum(int[] nums, int lower, int upper) {
        int c=0;
        long sum=0;
        List<Long> arr = new ArrayList<>();
        arr.add(0L);
        for(int i:nums) {
            sum+=i;
            c+=(upperBound(arr, sum-lower)-lowerBound(arr, sum-upper));
            arr.add(lowerBound(arr, sum), sum);
        }
        return c;
    }

}