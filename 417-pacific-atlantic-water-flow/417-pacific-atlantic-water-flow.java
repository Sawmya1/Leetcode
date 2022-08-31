class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rlen = heights.length;
        int clen = heights[0].length; 
        List<List<Integer>> output = new ArrayList();
        boolean[][] atlantic = new boolean[rlen][clen];
        boolean[][] pacific = new boolean[rlen][clen];

//Do a DFS on all nodes at the pacific end and the atlantic end:
        for(int r = 0; r < rlen; r++){
            for(int c = 0; c < clen; c++){          
                if(r == 0 || c == 0){ dfs(pacific, heights, r, c, 0);}
                if(r == rlen-1 || c == clen-1){ dfs(atlantic, heights, r, c, 0); }
            }
        }
        
// Check which locations can reach both pacific and atlantic:
        for(int r = 0; r < rlen; r++){
            for(int c = 0; c < clen; c++){          
                if(atlantic[r][c] && pacific[r][c]){
                    output.add(Arrays.asList(r,c));
                }
            }
        }
        return output;
    }
    
    // Go to a node - all the larger ones around it can reach the current sea:
    public void dfs(boolean[][] sea, int[][] grid, int r, int c, int prev){
        if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length) return;
        if(grid[r][c] < prev) return;
        if(sea[r][c]) return; 
        
        sea[r][c] = true;
        dfs(sea, grid, r+1, c, grid[r][c]); // bottom 
        dfs(sea, grid, r-1, c, grid[r][c]); // top 
        dfs(sea, grid, r, c-1, grid[r][c]); // left 
        dfs(sea, grid, r, c+1, grid[r][c]); // right
 
    }
}