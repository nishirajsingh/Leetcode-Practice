class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] r = new boolean[9][9];
        boolean[][] c = new boolean[9][9];
        boolean[][]e = new boolean[9][9];
        for(int i=0;i<9;i++){
            for(int j = 0;j<9;j++){
                char ch = board[i][j];
                if(ch=='.')continue;
                int n = ch-'1';
                if(r[i][n] || c[j][n] || e[(i/3)*3+(j/3)][n]) return false;
                r[i][n]=true;
                c[j][n]=true;
                e[(i/3)*3+(j/3)][n]=true;
            }
        }
        return true;
        
    }
}