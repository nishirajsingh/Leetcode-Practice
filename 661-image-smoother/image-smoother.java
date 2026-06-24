class Solution {
    public int[][] imageSmoother(int[][] img) {
        int n=img.length;
        int m=img[0].length;

        int[][] res = new int[n][m];
        int[] r = new int[]{-1,1,0,0,-1,-1,1,1};
        int[] c = new int[]{0,0,1,-1,-1,1,1,-1};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int sum=img[i][j];
                int t=1;
                for(int k=0;k<r.length;k++){
                    int n1=i+r[k];
                    int n2=j+c[k];
                    if(n1>=0 && n1<n && n2>=0 && n2<m){
                        sum+=img[n1][n2];
                        t++;
                    }
                }
                res[i][j]=sum/t;
            }
        }
        return res;
    }
}