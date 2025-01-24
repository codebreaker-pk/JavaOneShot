import java.util.Scanner;

public class TestClass {

    static int singleCells(int m, int n, String[] chess) {
        int count = 0;

        // To track visited cells
        boolean[][] visited = new boolean[m][n];

        // Traverse the chessboard
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If a '0' cell is found that hasn't been visited
                if (chess[i].charAt(j) == '0' && !visited[i][j]) {
                    // If the size of the connected component is odd, count it as a single cell
                    if (dfs(i, j, m, n, chess, visited) % 2 == 1) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    // Helper function for DFS
    static int dfs(int x, int y, int m, int n, String[] chess, boolean[][] visited) {
        visited[x][y] = true;
        int cells = 1;  // Initial count is 1 for the current cell

        // Direction arrays for moving right, down, left, and up
        int[] rowDir = {0, 1, 0, -1};
        int[] colDir = {1, 0, -1, 0};

        // Explore adjacent cells
        for (int d = 0; d < 4; d++) {
            int newX = x + rowDir[d];
            int newY = y + colDir[d];

            // Check boundaries and if the cell is '0' and not visited
            if (newX >= 0 && newX < m && newY >= 0 && newY < n &&
                    chess[newX].charAt(newY) == '0' && !visited[newX][newY]) {
                cells += dfs(newX, newY, m, n, chess, visited);  // Recursively count adjacent '0' cells
            }
        }
        return cells;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();

        String[] grid = new String[m];
        for (int i = 0; i < m; i++) {
            grid[i] = sc.nextLine();
        }

        System.out.println(singleCells(m, n, grid));
    }
}
