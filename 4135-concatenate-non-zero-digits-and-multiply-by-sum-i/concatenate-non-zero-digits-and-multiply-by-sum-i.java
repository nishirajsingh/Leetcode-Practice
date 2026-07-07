class Solution {
    public long sumAndMultiply(int n) {
        int sum =0;
        int i=1;
        int x= 0;
        while(n!=0){
            int d = n%10;
            n/=10;
            if(d==0)continue;
            sum+=d;
            x+=(d*i);
            i*=10;

        }
        return (long) sum*x;
    }
}