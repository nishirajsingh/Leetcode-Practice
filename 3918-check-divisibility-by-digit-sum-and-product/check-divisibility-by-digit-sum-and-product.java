class Solution {
    public boolean checkDivisibility(int n) {
       int o = n;
       long sum = 0;
       long mul = 1;
        while(n!=0){
            sum+= (n%10);
            mul*=(n%10);
            n/=10;
        }
        return o%(sum+mul)==0;
    }
}