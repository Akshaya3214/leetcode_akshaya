class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(hs.containsKey(nums[i])){
                int prevInd = hs.get(nums[i]);
                if(i-prevInd <= k){
                    return true;
                }
            }
            hs.put(nums[i], i);
        }
        return false;
    }
}