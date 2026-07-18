class Solution {
    public int rev(int n){
        int r = 0;
        while(n!=0){
            int d = n%10;
            r = r*10+d;
            n/=10;
        }
        return r;
    }
    public boolean isSameAfterReversals(int num) {
        return num == rev(rev(num));
    }
}