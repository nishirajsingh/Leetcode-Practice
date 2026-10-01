class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int l = 0,h=m-1;
        while(l<=h) {
            int mid = l+(h-l)/2;
            int max = 0;
            for(int i=1;i<n;i++) {
                if(mat[i][mid]>mat[max][mid]) {
                    max=i;
                }
            }
            if(((mid==0)||(mat[max][mid]>mat[max][mid-1])) && ((mid==m-1)||(mat[max][mid]>mat[max][mid+1]))){
                return new int[]{max, mid};
            }else if(mid<m-1 && mat[max][mid]<mat[max][mid+1]) l = mid+1;
            else h = mid-1;
        }
        return new int[]{-1, -1};
    }
}