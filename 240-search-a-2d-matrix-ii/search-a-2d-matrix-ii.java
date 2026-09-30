class Solution {
    public boolean BS(int[] arr,int target){
        int l = 0;
        int h = arr.length-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(arr[mid]==target) return true;
            if(arr[mid]<target)l=mid+1;
            else h=mid-1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n;i++){
            if(matrix[i][0]<=target && matrix[i][m-1]>=target){
                if(BS(matrix[i],target))return true;
            }
        }
        return false;
    }
}