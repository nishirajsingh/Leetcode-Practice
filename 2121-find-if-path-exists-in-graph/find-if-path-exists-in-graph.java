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
    boolean isPath(int sc,int dst,boolean[] visit){
        if(sc==dst) return true;
        if(visit[sc]) return false;
        visit[sc]=true;
        for(int i:adj.get(sc)){
            if(isPath(i,dst,visit)) return true;
        }
        return false;
    }
    
}
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Graph g = new Graph(n);
        for(int i=0;i<edges.length;i++){
            int sc = edges[i][0];
            int dst = edges[i][1];
            g.addEdge(sc,dst);
        }
        return g.isPath(source,destination,new boolean[n]);
    }
}