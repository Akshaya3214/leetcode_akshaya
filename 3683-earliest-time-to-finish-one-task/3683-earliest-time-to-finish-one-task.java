class Solution {
    public int earliestTime(int[][] tasks) {
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int[] task : tasks){
            sum = task[0] + task[1];
            min=Math.min(min, sum);
        }
        return min;
    }
}