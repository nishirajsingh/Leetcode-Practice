class Graph{
    int n;
    // ArrayList<Integer>[] adj;
    
    // Graph(int n){
    //     this.n=n;
    //     adj=new ArrayList[n+1];
    //     for(int i=0;i<adj.length;i++){
    //         adj[i]=new ArrayList<>();
    //     }
    // }
    // void addEdge(int src,int dest){
    //     adj[src].add(dest);
    //     adj[dest].add(src);
    // }
    
    //Using ArrayList of ArrayList
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
    public int makeConnected(int n, int[][] connections) {
        if(n-1>connections.length) return -1;
        Graph g = new Graph(n);
        for(int i=0;i<connections.length;i++){
            int sc = connections[i][0];
            int dst = connections[i][1];
            g.addEdge(sc,dst);
        }
        int c = 0;
        boolean[] visit = new boolean[n];
        return g.components(c,visit)-1;
    }
}