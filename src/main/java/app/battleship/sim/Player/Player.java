package app.battleship.sim.Player;

import app.battleship.sim.Grid.Grid;
import app.battleship.sim.Position.Position;

public class Player {
    private int gridSize;
    private int totalShips;
    private int totalMissiles;
    private Position[] shipPositions;
    private Position[] missilePositions;
    private Grid grid;
    private int totalHits = 0;

    public Player(int gridSize, int totalShips, int totalMissiles, Position[] shipPositions, Position[] missilePositions) {
        this.gridSize = gridSize;
        this.totalShips = totalShips;
        this.totalMissiles = totalMissiles;
        this.shipPositions = shipPositions;
        this.missilePositions = missilePositions;
        grid = new Grid(gridSize);
        grid.initialiseWithShips(this.shipPositions);
    }

    public char[][] getGrid(){
        return grid.getGrid();
    }

    public void setGridAtIndex(int i, int j, char outcome){
        grid.setGridAtIndex(i, j, outcome);
    }

    public char getGridAtIndex(int i, int j){
        return grid.getGridAtIndex(i, j);
    }

    public Position[] getMissilePositions() {
        return missilePositions;
    }

    public Position getMissilePositionAtIndex(int i){
        return missilePositions[i];
    }

    public int getTotalMissiles() {
        return totalMissiles;
    }

    public void printGrid(){
        grid.printGrid();
    }

    public int getTotalHits() {
        return totalHits;
    }

    public void setTotalHits(int totalHits) {
        this.totalHits = totalHits;
    }
}
