class Solution {
    public int countCommas(int n) {
        int sum = 0;
        long a = 1000;
        while (n>=a){
            sum+=(n-a+1);
            a*=1000;
        }
        return sum;
        
    }
}