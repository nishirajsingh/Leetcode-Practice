class Solution {
    public int countIslands(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int res = 0;
        int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    int rem = 0;
                    Queue<int[]> q = new LinkedList<>();
                    q.offer(new int[]{i, j});
                    rem = (rem + grid[i][j]) % k;
                    grid[i][j] = -1;
                    while (!q.isEmpty()) {
                        int[] curr = q.poll();
                        int r = curr[0];
                        int c = curr[1];
                        for (int[] d : dir) {
                            int nr = r + d[0];
                            int nc = c + d[1];
                            if (nr >= 0 && nr < m && nc >= 0 && nc < n && grid[nr][nc] > 0) {
                                rem = (rem + grid[nr][nc]) % k;
                                grid[nr][nc] = -1;
                                q.offer(new int[]{nr, nc});
                            }
                        }
                    }
                    if (rem == 0) res++;
                }
            }
        }
        return res;
    }
}