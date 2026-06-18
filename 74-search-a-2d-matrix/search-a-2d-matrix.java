class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int l = 0, r = (n-1);
        while(l<m && r>=0){
            int val = matrix[l][r];
            if(val==target) return true;
            if(val>target) r--;
            else l++;
        }
        return false;
    }
}