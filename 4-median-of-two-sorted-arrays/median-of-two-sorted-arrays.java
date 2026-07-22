class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int o = n+m;
        int[] a = new int[o];
        for(int i=0;i<n;i++){
            a[i]=nums1[i];
        }
        for(int i=0;i<m;i++){
            a[i+n]=nums2[i];
        }
        Arrays.sort(a);
        if (o%2==1) return a[o/2];
        return (a[o/2]+a[(o/2)-1])/2.0;
    }
}