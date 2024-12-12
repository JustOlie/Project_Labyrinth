public class PlayArea {

    private int[][] grid;

    public PlayArea(int rows, int cols) {
        grid = new int [rows][cols];
        //GRID MET AANTAL RIJ EN KOLOM
    }

    public void setGridValue(int row, int col, int value) {
        grid[row][col] = value;
    }

    public int getGridValue(int row, int col) {
        return grid[row][col];
    }

    public int[][] getGrid() {
        return grid;
    }


}
