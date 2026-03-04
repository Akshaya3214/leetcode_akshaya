class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int max=nums.length/3;
        HashMap<Integer, Integer> hs = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int num : nums){
            hs.put(num, hs.getOrDefault(num, 0)+1);
            if(hs.get(num) == max+1){
                res.add(num);
            }
        }
        return res;
    }
}