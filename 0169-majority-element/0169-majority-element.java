class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int res=0;
        int n=nums.length;
        int majority=n/2;

        for(int i:nums){
            hash.put(i, hash.getOrDefault(i, 0)+1);
            if(hash.get(i)>majority){
                res = i;
            }
        }
        return res;
    }
}