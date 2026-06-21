class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int sum=0,c=0;
        for(int i:costs){
            if(i<=coins){
                sum+=i;
                c++;
                coins-=i;
            }
        }
        return c;
    }
}