class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] dp =  new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]= (i==j)?0:10000000;
            }
        }
        for(int[]i:edges){
            int u= i[0];
            int v = i[1];
            int w= i[2];
            dp[u][v]=w;
            dp[v][u]=w;
        }
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(dp[i][k] == 10000000 && dp[k][j]==10000000)continue;
                    dp[i][j]=Math.min(dp[i][j],dp[i][k]+dp[k][j]);
                }
            }
        }
        int res=-1;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(i!=j && dp[i][j]<=distanceThreshold)c++;
            }
            if(c<=min){
                min = c;
                res=i;
            }

        }
        return res;
    }
}