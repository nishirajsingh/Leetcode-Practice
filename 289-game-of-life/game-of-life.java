class Solution {
    public void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;
        int[][] temp = new int[n][m];
        for (int i = 0; i < n; i++) {
            temp[i] = board[i].clone();
        }
        int[] r = new int[]{-1,1,0,0,-1,-1,1,1};
        int[] co = new int[]{0,0,1,-1,-1,1,1,-1};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int c =0;
                for(int k=0;k<r.length;k++){
                    int n1=i+r[k];
                    int n2=j+co[k];
                    if(n1>=0 && n1<n && n2>=0 && n2<m){
                        if(temp[n1][n2]==1)c++;
                    }
                }
                if(temp[i][j]==1){
                    if(c<2) board[i][j]=0;
                    else if(c==2 || c==3)board[i][j]=1;
                    else if(c>3)board[i][j]=0;
                }else{
                    if(c==3)board[i][j]=1;
                }
            }
        }
    }
}