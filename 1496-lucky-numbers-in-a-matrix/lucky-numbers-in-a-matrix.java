class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            int c = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    c = j;
                }
            }
            boolean isMax = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][c] > min) {
                    isMax = false;
                    break;
                }
            }   
            if (isMax) {
                arr.add(min);
            }
        }
        return arr;
    }
}