class Solution {
    public int[] sortedSquares(int[] nums) {
        int n =nums.length;
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        int [] ans = new int[n];
        int i=0,j=n-1, k=n-1;
        while(i<=j){
            if(i==j){
                ans[k]=nums[i];
            }
            if(nums[i]>nums[j]){
                ans[k]=nums[i];
                i++;
                k--;
            }else{
                ans[k]=nums[j];
                k--;
                j--;
            }
        }
        return ans;
    }
}