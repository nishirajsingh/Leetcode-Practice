class ft{
    private int n;
    private int[]c;
    public ft(int n){
        this.n = n;
        this.c = new int[n+1];
    }
    public void update(int s,int delta){
        for(;s<=n;s+=s&(-s)){
            c[s]+=delta;
        }
    }
    public int query(int x){
        int s=0;
        for(;x>0;x-=x&(-x)){
            s+=c[x];
        }
        return s;

    }
}
class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        ft tree = new ft(2*n+1);
        int s = n+1;
        tree.update(s,1);
        long res=0;
        for(int i: nums){
            if(i==target){
                s+=1;
            }
            else s-=1;
            res+=tree.query(s-1);
            tree.update(s,1);
        }
        return res;

    }
}