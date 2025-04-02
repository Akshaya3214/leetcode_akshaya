class Solution {
    public int maxOperations(int[] nums, int k) {
        int count=0;
        
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int num:nums){
            int complement = k-num;
            
            if(hs.getOrDefault(complement,0)>0){
                count++;
                hs.put(complement, hs.get(complement)-1);
            }else{
                hs.put(num, hs.getOrDefault(num,0)+1);
            }
        }
        return count;
    }
}