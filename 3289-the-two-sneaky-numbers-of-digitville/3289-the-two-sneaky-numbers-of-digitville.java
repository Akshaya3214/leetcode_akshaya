class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n=nums.length;
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0; i<n-1; i++){
            if(nums[i]==nums[i+1]){
                list.add(nums[i]);
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res; 
    }
}