class Solution {
    public int longestSubarray(int[] nums) {
        int maxLength = 0;
        int prevCount = 0, currCount = 0;
        boolean hasZero = false;

        for(int num:nums){
            if(num==1){
                currCount++;
            }else{
                hasZero=true;
                maxLength=Math.max(maxLength, prevCount+currCount);
                prevCount=currCount;
                currCount=0;
            }
        }
        maxLength = Math.max(maxLength, prevCount + currCount);

        return hasZero ? maxLength : maxLength-1;
    }
}