import java.util.Stack;

public class NoOfIsland {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int numIslands = 0;
        int n = grid.length;
        int m = grid[0].length;

      
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
             
                if (grid[i][j] == '1') {
                    numIslands++;
                
                    iterativeDFS(grid, i, j, n, m);
                }
            }
        }

        return numIslands;
    }

    private void iterativeDFS(char[][] grid, int startX, int startY, int n, int m) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{startX, startY});

        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};


        grid[startX][startY] = '0';

        while (!stack.isEmpty()) {
            int[] current = stack.pop();
            int x = current[0];
            int y = current[1];

        
            for (int[] dir : directions) {
                int newX = x + dir[0];
                int newY = y + dir[1];

                if (newX >= 0 && newX < n && newY >= 0 && newY < m && grid[newX][newY] == '1') {
                   
                    grid[newX][newY] = '0';
                    stack.push(new int[]{newX, newY});
                }
            }
        }
    }
}