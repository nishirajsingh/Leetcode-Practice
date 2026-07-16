class Solution {
    public long gcd(long a,long b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
    public long gcdSum(int[] nums) {
        int mx= 0;
        ArrayList<Long> f= new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            mx = Math.max(nums[i],mx);
            f.add(gcd(nums[i],mx));
        }
        Collections.sort(f);
        int i=0;
        int j = f.size()-1;
        long sum=0;
        while(i<j){
            sum +=gcd(f.get(i),f.get(j));
            i++;
            j--;
        }
        return sum;
    }
}