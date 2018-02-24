import java.util.*;

class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0) return 0;

        int numRow = grid.length;
        int numCol = grid[0].length;
        int numCountries = 0;

        for (int i = 0; i < numRow; i++){
            for (int j = 0; j < numCol; j++){
                if (grid[i][j] != '0'){
                    numCountries++;
                    markVisited(grid, grid[i][j], i, j, numRow, numCol);
                }
            }
        }
       return numCountries;
    }

    public void markVisited(char[][] grid, char elem, int i, int j, int numRow, int numCol){
        if(i<0||i>=numRow||j<0||j>=numCol||grid[i][j]!=elem)
            return;
        grid[i][j] = '0'; // Used as a flagging value to mark that it has been visited.
        markVisited(grid,elem,i-1,j,numRow,numCol);
        markVisited(grid,elem,i+1,j,numRow,numCol);
        markVisited(grid,elem,i,j-1,numRow,numCol);
        markVisited(grid,elem,i,j+1,numRow,numCol);
    }
}
