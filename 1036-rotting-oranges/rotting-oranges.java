class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid==null || grid.length==0){
            return -1;
        }
        int rows=grid.length;
        int cols=grid[0].length;
        int fresh=0;
        Queue<int[]> q=new ArrayDeque<>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1) fresh++;
                else if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
            }
        }
        if(fresh==0) return 0;
        int minutes=0;
        int[] rowDir={-1,1,0,0};
        int[] colDir={0,0,-1,1};
        while(!q.isEmpty()){
            int size=q.size();//elements in curr level

            for(int i=0;i<size;i++){
                int[] curr=q.poll();
                for(int k=0;k<4;k++){//four direction movement using 2 arrays i.e. rowDir and colDir
                    int x=curr[0]+rowDir[k];//adding in row index to move top and bottom
                    int y=curr[1]+colDir[k];//adding in col index to movve left and right
                    if(x>=0 && y>=0 && x<rows && y<cols && grid[x][y]==1){//if index is valid and orange present is fresh
                        fresh--;//reduce fresh
                        grid[x][y]=2;
                        q.add(new int[] {x,y});//add this rotten orange in queue
                    }
                }
            }
            minutes++;
        }
        return fresh==0?minutes-1:-1;
        
    }
}