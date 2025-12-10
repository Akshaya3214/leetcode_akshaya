class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> hs = new HashSet<>();
        for(int a:friends){
            hs.add(a);
        }
        int k=0;
        for(int i=0; i<order.length; i++){
            if(hs.contains(order[i])){
                friends[k++]=order[i];
            }
        }
        return friends;
    }
}