class Solution {
    public boolean isPossible(int mid, int[][] t){
        Arrays.sort(t,(a,b)->(b[1]-b[0])-(a[1]-a[0]));
        int min = 0;
        int curr=mid;
        for(int i= 0;i<t.length;i++){
            if(curr>=t[i][1]){
                curr-=t[i][0];
            }
            else return false;
        }
        return true;
        
    }
    public int minimumEffort(int[][] tasks) {
        int l=1;
        int h = 100000;
        int ans = h;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(isPossible(mid,tasks)){
                ans = mid;
                h = mid-1;
            }else l = mid+1;
        }
        return ans;
    }
}