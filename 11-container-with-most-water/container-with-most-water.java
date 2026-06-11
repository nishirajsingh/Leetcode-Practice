class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int res=0;
        while(i<j){
            int t = Math.min(height[i],height[j])*(j-i);
            res= Math.max(res,t);
            if(height[i]<height[j]) i++;
            else j--;
        }
        return res;
    }
}