class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m>=n){
        for(int i=m+n-1;i>=m;i--){
            nums1[i]=nums2[i-m];
        }
        }else{
            for(int i=m+n-1;i>=n;i--){
                nums1[i]=nums1[i-n];
            }
            for(int i=n-1;i>=0;i--){
                nums1[i]=nums2[i];
            }
        }
        Arrays.sort(nums1);
    }
}