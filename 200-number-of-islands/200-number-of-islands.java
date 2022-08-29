class Solution {
    public void clearRestLand(char[][] grid, int i, int j){
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0') return;
    //future purpose        
        grid[i][j] = '0';
        clearRestLand(grid,i+1,j);
        clearRestLand(grid,i-1,j);
        clearRestLand(grid,i,j+1);
        clearRestLand(grid,i,j-1);
    }
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j] == '1'){
                    count++;
                    clearRestLand(grid,i,j);  
                    //so that 1 land isn't counted twice             
                }                
            }
        return count;
    }
}