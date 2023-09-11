package app.battleship.sim;

import app.battleship.sim.Game.Game;
import app.battleship.sim.Grid.Grid;
import app.battleship.sim.Player.Player;
import app.battleship.sim.Position.Position;

public class BattleshipApplication {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int M = 5, S = 5;

        //1,1:2,0:2,3:3,4:4,3
        Position position1 = new Position(1, 1);
        Position position2 = new Position(2, 0);
        Position position3 = new Position(2,3);
        Position position4 = new Position(3, 4);
        Position position5 = new Position(4, 3);

        //Position[] playerOneShipPos = new Position[S];
        Position[] playerOneShipPos = {position1, position2, position3, position4, position5};

        //0,1:2,3:3,0:3,4:4,1
        position1 = new Position(0, 1);
        position2 = new Position(2, 3);
        position3 = new Position(3, 0);
        position4 = new Position(3, 4);
        position5 = new Position(4, 1);

        //Position[] playerTwoShipPos = new Position[S];
        Position[] playerTwoShipPos = {position1, position2, position3, position4, position5};

        int T = 5;

        //0,1:4,3:2,3:3,1:4,1
        position1 = new Position(0, 1);
        position2 = new Position(4, 3);
        position3 = new Position(2, 3);
        position4 = new Position(3, 1);
        position5 = new Position(4, 1);

        Position[] playerOneTargets = {position1, position2, position3, position4, position5};

        //0,1:0,0:1,1:2,3:4,3
        position1 = new Position(0, 1);
        position2 = new Position(0, 0);
        position3 = new Position(1, 1);
        position4 = new Position(2, 3);
        position5 = new Position(4, 3);

        Position[] playerTwoTargets = {position1, position2, position3, position4, position5};

        Player player1 = new Player(M, S, T, playerOneShipPos, playerOneTargets);

        Player player2 = new Player(M, S, T, playerTwoShipPos, playerTwoTargets);

        Game game = new Game();
        game.playGame(player1, player2);
        game.printGameResult(player1, player2);

//        Grid newGrid = new Grid(M);
//        char[][] gridIns = newGrid.getGrid();
//
    }
}