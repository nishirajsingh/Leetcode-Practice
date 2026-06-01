class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n = cost.length;
        // if (n<2) return cost[n-1];
        // if(n<3) return cost[0]+cost[1];
        int sum=0;
        // int i=n-2,j=n-1;
        // while(i>=0 && j>=0){
            
        //     sum+=cost[i]+cost[j];
        //     i-=3;
        //     j-=3;
        // }
        // if(i<0 && j>=0){
        //         sum+=cost[j];
        //     }
        // return sum;
        int a=0;
        for(int i=n-1;i>=0;i--){
            a++;
            if(a==3){a=0;continue;}
            sum+=cost[i];
        }
        return sum;
    }
}