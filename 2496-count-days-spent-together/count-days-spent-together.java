class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] months = new int[]{0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dates = {arriveAlice, leaveAlice, arriveBob, leaveBob};
        int[] dayOfYear = new int[4];
        for (int i = 0; i < 4; i++) {
            int m = Integer.parseInt(dates[i].substring(0, 2));
            int d = Integer.parseInt(dates[i].substring(3, 5));            
            int totalDays = d;
            for (int j = 1; j < m; j++) {
                totalDays += months[j];
            }
            dayOfYear[i] = totalDays;
        }
        int a = Math.max(dayOfYear[0], dayOfYear[2]);
        int b = Math.min(dayOfYear[1], dayOfYear[3]);
        return a <= b?(b-a+1) : 0;

    }
}