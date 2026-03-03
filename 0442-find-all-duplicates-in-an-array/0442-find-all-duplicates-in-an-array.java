class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        List<Integer> ls = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            hs.put(nums[i], hs.getOrDefault(nums[i], 0)+1);
            if(hs.get(nums[i])==2){
                ls.add(nums[i]);
            }
        }
        return ls;
    }
}