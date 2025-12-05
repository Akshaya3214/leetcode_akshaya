class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> hs = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target-nums[i];

            if(hs.containsKey(complement)){
                return new int[]{i, hs.get(complement)};
            }
            hs.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}

