package app.battleship.sim.Grid;

public class Grid {
    private int[][] Grid;

    public Grid(int size) {
        this.Grid = new int[size][size];
    }

    public int[][] getGrid() {
        return Grid;
    }
}
