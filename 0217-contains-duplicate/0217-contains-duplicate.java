class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i:nums){
            if(hs.containsKey(i) && hs.get(i)>=1){
                return true;
            }
            hs.put(i, hs.getOrDefault(i, 0)+1);
            
        }
        return false;
    }
}