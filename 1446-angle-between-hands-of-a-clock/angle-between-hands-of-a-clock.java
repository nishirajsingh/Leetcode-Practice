class Solution {
    public double angleClock(int hour, int minutes) {
        double Bighand= (minutes *6)-(0.5*minutes);
        double smallhand= 30*hour;
        double angle = Math.abs(smallhand - Bighand);
        return Math.min(angle,360-angle);
    }
}