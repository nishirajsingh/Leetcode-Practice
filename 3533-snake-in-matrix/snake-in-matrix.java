class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int pos = 0;
        for(String s : commands){
            if(s.equals("RIGHT"))pos +=1;
            if(s.equals("LEFT"))pos -=1; 
            if(s.equals("DOWN"))pos +=n;
            if(s.equals("UP"))pos -= n;
        }
        return pos;
    }
}