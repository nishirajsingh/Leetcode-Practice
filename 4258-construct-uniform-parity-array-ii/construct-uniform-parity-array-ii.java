class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean s= true;
        int min = Integer.MAX_VALUE;
        for(int i:nums1){
            min= Math.min(min,i);
            if(i%2==1)s=false;
        }
        return s||(min%2==1);

    }
}