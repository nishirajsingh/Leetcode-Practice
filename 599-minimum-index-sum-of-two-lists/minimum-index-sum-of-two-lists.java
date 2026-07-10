class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min = Integer.MAX_VALUE;
        ArrayList<String> temp  = new ArrayList<>();
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                    if(min>(i+j)){
                        min=i+j;
                    }
                }
            }
        }
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                if(min==i+j){
                        if(i<j)temp.add(list1[i]);
                        else temp.add(list2[j]);
                    }
                }
            }
        }        
        return temp.toArray(new String[0]);
    }
}