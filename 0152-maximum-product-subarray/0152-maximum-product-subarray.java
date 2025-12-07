class Solution {
    public int maxProduct(int[] nums) {
        int curmax=nums[0];
        int curmin=nums[0];
        int maxprod=nums[0];
        for(int i=1; i<nums.length; i++){
            int temp = curmax;
            curmax=Math.max(nums[i], Math.max(nums[i]*curmax, nums[i]*curmin));
            curmin=Math.min(nums[i], Math.min(nums[i]*temp, nums[i]*curmin));
            maxprod=Math.max(maxprod, curmax);
        }
        return maxprod;
    }
}