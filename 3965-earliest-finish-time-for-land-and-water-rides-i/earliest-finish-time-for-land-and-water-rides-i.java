class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int a=1000000;
        for (int i=0;i<landStartTime.length;i++) {
            a=Math.min(a,landStartTime[i]+landDuration[i]);
        }
        int b=1000000;
        for (int i=0;i<waterStartTime.length;i++) {
            b=Math.min(b,waterStartTime[i]+waterDuration[i]);
        }
        int total=1000000;
        for (int i=0;i<waterStartTime.length;i++) {
            total=Math.min(total, Math.max(a,waterStartTime[i])+waterDuration[i]);
        }
        for (int i=0;i<landStartTime.length;i++) {
            total=Math.min(total, Math.max(b,landStartTime[i])+landDuration[i]);
        }
        return total;
    }
}