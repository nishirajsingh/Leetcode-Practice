class Solution {
    public boolean isPrime(int n){
        if(n==1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        int p=0;
        for(int i=0;i<n;i++){
            if(isPrime(nums[i][i])){
                p= Math.max(nums[i][i],p);
            }
             if(isPrime(nums[i][n-i-1])){
                p= Math.max(nums[i][n-i-1],p);
            }
        }
        return p;
    }
}