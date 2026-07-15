class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumeven=2;
        int sumodd=1;
        for(int i=3;i<=n*2;i++){
            sumeven+=(i%2==0)?i:0;
            sumodd+=(i%2==1)?i:0;
        }
        return gcd(sumodd,sumeven);
    }
    public int gcd(int a, int b){
        return (b == 0) ? a : gcd(b, a % b);
    }
}