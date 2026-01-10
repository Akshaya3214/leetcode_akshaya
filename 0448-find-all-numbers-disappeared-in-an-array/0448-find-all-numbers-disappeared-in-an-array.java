
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int n:nums){
            hs.add(n);
        }
        List<Integer> res = new ArrayList<>();
        for(int i=1; i<nums.length+1; i++){
            if(!hs.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}