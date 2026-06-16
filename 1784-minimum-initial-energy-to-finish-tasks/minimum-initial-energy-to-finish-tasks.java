class Solution {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks,(a,b) -> (b[1] - b[0]) - (a[1] - a[0]));
        int minEnergy = 0;
        int currentEnergy = 0;
        for(int i = 0; i < tasks.length; i++){
            if(currentEnergy < tasks[i][1]){
                minEnergy+=(tasks[i][1] - currentEnergy);
                currentEnergy+=(tasks[i][1] - currentEnergy);
            }
            currentEnergy-=tasks[i][0];
        }
        return minEnergy;
    }
}