class Graph{
    int n;
    ArrayList<ArrayList<Integer>> adj;
    Graph(int n){
        this.n=n;
        adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Integer>());
        }
    }
    void addEdge(int src,int dest){
        adj.get(src).add(dest);
        adj.get(dest).add(src);
    }
    void dfs(int sc, boolean[] visit){
        if(visit[sc]) return;
        visit[sc] = true;
        for(int i:adj.get(sc)){
            dfs(i,visit);
        }
    }
    int components(int c,boolean[] visit){
        for(int i=0;i<n;i++){
            if(visit[i]) continue;
            dfs(i,visit);
            c++;
        }
        return c;
    }

    
}
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        Graph g=new Graph(n);
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++){
                if(isConnected[i][j]==1){ 
                    g.addEdge(i,j);
                }
            }
        }
        return g.components(0,new boolean[n]);
    }
}