class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int l= 0,h=m-1;
        while(l<n && h>=0){
            if(matrix[l][h]==target)return true;
            if(matrix[l][h]<target)l++;
            else h--;
        }
        return false;
    }
}