//
// TetrisGrid encapsulates a tetris board and has
// a clearRows() capability.

public class TetrisGrid {
    private boolean[][] grid;
	/**
	 * Constructs a new instance with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public TetrisGrid(boolean[][] grid) {
        this.grid = grid;
	}
	
	
	/**
	 * Does row-clearing on the grid (see handout).
	 */
    public void clearRows() {
        int width = grid.length;
        int height = grid[0].length;
        int writeRow = 0;

        for (int y = 0; y < height; y++) {
            boolean full = true;
            for (int x = 0; x < width; x++) {
                if (!grid[x][y]) {
                    full = false;
                    break;
                }
            }
            if (!full) {
                for (int x = 0; x < width; x++) {
                    grid[x][writeRow] = grid[x][y];
                }
                writeRow++;
            }
        }
        for (int y = writeRow; y < height; y++) {
            for (int x = 0; x < width; x++) {
                grid[x][y] = false;
            }
        }
    }
	
	/**
	 * Returns the internal 2d grid array.
	 * @return 2d grid array
	 */
    boolean[][] getGrid() {
        return grid;
    }
    public static void main(String[] args) {
        boolean[][] g = {
                {false, true, true},
                {true,  true, true}
        };
        TetrisGrid tg = new TetrisGrid(g);
        tg.clearRows();
        for (int y = g[0].length - 1; y >= 0; y--) {
            for (int x = 0; x < g.length; x++) {
                System.out.print(g[x][y] ? "X " : ". ");
            }
            System.out.println();
        }
    }
}
