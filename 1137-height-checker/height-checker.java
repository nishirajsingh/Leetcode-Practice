class Solution {
    public int heightChecker(int[] heights) {
        int[] temp = heights.clone(); 
        int c=0;
        Arrays.sort(heights);
        for(int i=0;i<heights.length;i++){
            if(temp[i]!=heights[i]) c++;
        }
        return c;

    }
}