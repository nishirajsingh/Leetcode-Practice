class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int [] leftsum = new int[n];
        int [] rightsum = new int[n];
        int [] answer= new int[n];
        for(int i=n-1;i>=0;i--){
            int sum=0;
            for(int j=i-1;j>=0;j--){
                sum+=nums[j];
            }
            leftsum[i]=sum;
        }
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i+1;j<n;j++){
                sum+=nums[j];
            }
            rightsum[i]=sum;
        }
        for(int i=0;i<n;i++){
            answer[i]= Math.abs(leftsum[i]-rightsum[i]);
        }
        return answer;
    }
}