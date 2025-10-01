// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid

public class CharGrid {
	private char[][] grid;

	public CharGrid(char[][] grid) {
        this.grid = grid;
	}
	
	/**
	 * Returns the area for the given char in the grid. (see handout).
	 * @param ch char to look for
	 * @return area for given char
	 */
	public int charArea(char ch) {
        int hang = grid.length;
        int cot = grid[0].length;
        int min_hang = hang;
        int min_cot = cot;
        int max_hang = -1;
        int max_cot = -1;
        for(int i =0;i<hang;i++) {
            for(int j=0;j<cot;j++) {
                if(grid[i][j] == ch) {
                    if(i < min_hang) min_hang = i;
                    if(i > max_hang) max_hang = i;
                    if(j < min_cot) min_cot = j;
                    if(j > max_cot) max_cot = j;
                 }
            }
        }
        if(max_hang == -1) {
            return 0;
        }
        if(min_cot == max_cot && min_hang == max_hang) {
            return 1;
        }
        int height = max_hang - min_hang + 1;
        int width = max_cot - min_cot + 1;
        return height * width;
	}
	
	/**
	 * Returns the count of '+' figures in the grid (see handout).
	 * @return number of + in grid
	 */
	public int countPlus() {
		return 0; // YOUR CODE HERE
	}
    public static void main(String[] args) {
        char[][] arr = {
                {'c', 'a', 'x'},
                {'b', ' ', 'b'},
                {' ', ' ', 'a'},
        };

        CharGrid cg = new CharGrid(arr);
        System.out.println("Area of 'a': " + cg.charArea('a'));
    }
	
}
