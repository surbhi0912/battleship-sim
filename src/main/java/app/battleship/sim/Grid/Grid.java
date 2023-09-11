package app.battleship.sim.Grid;

import app.battleship.sim.Position.Position;

public class Grid {
    private char[][] grid;

    public Grid(int size) {
        this.grid = new char[size][size];
    }

    public void initialiseWithShips(Position[] shipPosition){
        for(int i = 0; i < shipPosition.length; i++){
            grid[shipPosition[i].getX()][shipPosition[i].getY()] = 'B';
        }
    }

    public char[][] getGrid() {
        return grid;
    }

    public void setGridAtIndex(int i, int j, char outcome) {
        grid[i][j] = outcome;
    }

    public char getGridAtIndex(int i, int j){
        return grid[i][j];
    }

    public void printGrid(){
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                System.out.println(grid[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
