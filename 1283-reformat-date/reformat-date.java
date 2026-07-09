class Solution {
    public String reformatDate(String date) {
        String[] parts = date.split(" ");
        String day = parts[0];
        String month = parts[1];
        String year = parts[2];
        StringBuilder sb = new StringBuilder();
        sb.append(year).append("-");
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int monthIdx = 0;
        for (int i = 0; i < 12; i++) {
            if (months[i].equals(month)) {
                monthIdx = i + 1;
                break;
            }
        }
        if (monthIdx < 10) sb.append("0");
        sb.append(monthIdx).append("-");
        String dayNum = day.replaceAll("[a-z]", "");
        if (dayNum.length() == 1) sb.append("0");
        sb.append(dayNum);
        return sb.toString();
    }
}