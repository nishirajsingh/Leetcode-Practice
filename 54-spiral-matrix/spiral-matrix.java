class Solution {
    public List<Integer> spiralOrder(int[][] x) {
        int n = x.length;
        int m= x[0].length;
        int a=0,b=n-1,c=0,d=m-1;
        List<Integer> arr = new ArrayList<>();
        while(a<=b && c<=d){
            for(int i=c;i<=d;i++){
                arr.add(x[a][i]);
            }
            a++;
            for(int i=a;i<=b;i++){
                arr.add(x[i][d]);

            }
            d--;
            if(a<=b){
            for(int i=d;i>=c;i--){
                arr.add(x[b][i]);
            }
            b--;
        }
        if(c<=d){
            for(int i=b;i>=a;i--){
                arr.add(x[i][c]);
            }
            c++;
        }
        }
        return arr;
    }
}