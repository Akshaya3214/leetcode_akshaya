class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
        int count=0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n;j++){
                boolean equal=true;
                for(int k=0; k<n; k++){
                    if(grid[i][k]!=grid[k][j]){
                        equal=false;
                    }
                }
                if(equal==true){
                    count++;
                }
            }
        }
        return count;
    }
}

