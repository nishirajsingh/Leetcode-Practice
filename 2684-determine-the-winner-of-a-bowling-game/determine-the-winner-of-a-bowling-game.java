class Solution {
    public int totalhit(int []arr){
        int sum = 0;
        for(int i=0; i<arr.length;i++) {
            if((i > 0 && arr[i - 1] == 10) || (i > 1 && arr[i - 2] == 10)) sum += 2*arr[i];
            else sum+=arr[i];
        }
        return sum;

    }
    public int isWinner(int[] player1, int[] player2) {
       int p1point = totalhit(player1);
       int p2point = totalhit(player2);
       if(p1point>p2point) return 1;
       else if(p2point>p1point) return 2;
       return 0; 
    }
}