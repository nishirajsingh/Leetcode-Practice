class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int a=Integer.MAX_VALUE;
        for (int i=0;i<landStartTime.length;i++) {
            a=Math.min(a,landStartTime[i]+landDuration[i]);
        }
        int b=Integer.MAX_VALUE;
        for (int i=0;i<waterStartTime.length;i++) {
            b=Math.min(b,waterStartTime[i]+waterDuration[i]);
        }
        int sum = Integer.MAX_VALUE;
        for (int i=0;i<waterStartTime.length;i++) {
            int c=Math.max(a,waterStartTime[i]);
            sum=Math.min(sum,c+waterDuration[i]);
        }
        for (int i=0;i<landStartTime.length;i++) {
            int c=Math.max(b,landStartTime[i]);
            sum=Math.min(sum,c+landDuration[i]);
        }
        return sum;
    }
}