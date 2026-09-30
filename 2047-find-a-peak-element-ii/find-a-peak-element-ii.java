class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int l = 0,h=n-1;
        while(l<=h) {
            int mid = l+(h-l)/2;
            int temp = 0;
            for(int j=1;j<m;j++) {
                if(mat[mid][j]>mat[mid][temp]) {
                    temp=j;
                }
            }
            boolean up = (mid == 0) || (mat[mid][temp]>mat[mid - 1][temp]);
            boolean down = (mid==n-1) || (mat[mid][temp]>mat[mid + 1][temp]);
            if(up && down){
                return new int[]{mid, temp};
            }else if(mid>0 && mat[mid-1][temp]>mat[mid][temp]) h = mid - 1;
            else l = mid+1;
        }
        return new int[]{-1, -1};
    }
}