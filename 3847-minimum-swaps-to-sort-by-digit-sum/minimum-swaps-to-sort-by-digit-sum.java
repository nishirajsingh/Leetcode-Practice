class Solution {
    public int getSum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int res = 0;
        boolean[] vis = new boolean[n];
        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]= nums[i];
            arr[i][1]=i;
        }
        Arrays.sort(arr,(a,b)->{
            int c = getSum(a[0]);
            int d = getSum(b[0]);
            if(c!=d)return Integer.compare(c,d);
            return Integer.compare(a[0],b[0]);
        });
        for(int i=0;i<n;i++){
            if(vis[i]|| arr[i][1]==i)continue;
            int c=0;
            int j=i;
            while(!vis[j]){
                vis[j]=true;
                j= arr[j][1];
                c++;
            }
            if(c>0){
                res+=(c-1);
            }
        }
        return res;
    }
}