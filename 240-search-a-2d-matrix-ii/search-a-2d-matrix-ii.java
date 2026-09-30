class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n;i++){
            if(matrix[i][0]<=target && matrix[i][m-1]>=target){
                int l = 0;
                int h = m-1;
                while(l<=h){
                    int mid = l+(h-l)/2;
                    if(matrix[i][mid]==target) return true;
                    if(matrix[i][mid]<target)l=mid+1;
                    else h=mid-1;
                }
            }
        }
        return false;
    }
}