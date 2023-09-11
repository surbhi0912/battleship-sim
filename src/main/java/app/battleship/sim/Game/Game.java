package app.battleship.sim.Game;

import app.battleship.sim.Player.Player;
import app.battleship.sim.Position.Position;

public class Game {
    public void playGame(Player player1, Player player2){

        for(int i = 0; i < player1.getTotalMissiles(); i++){
            Position firedByPlayer1 = player1.getMissilePositionAtIndex(i);
            if(player2.getGridAtIndex(firedByPlayer1.getX(), firedByPlayer1.getY()) == 'S') {
                player2.setGridAtIndex(firedByPlayer1.getX(), firedByPlayer1.getY(), 'X');
                player1.setTotalHits(player1.getTotalHits()+1);
//                player2.setRemainingShips(player2.getRemainingShips()-1);
            }
            else
                player2.setGridAtIndex(firedByPlayer1.getX(), firedByPlayer1.getY(), 'O');
        }

        for(int i = 0; i < player2.getTotalMissiles(); i++){
            Position firedByPlayer2 = player2.getMissilePositionAtIndex(i);
            if(player1.getGridAtIndex(firedByPlayer2.getX(), firedByPlayer2.getY()) == 'S') {
                player1.setGridAtIndex(firedByPlayer2.getX(), firedByPlayer2.getY(), 'X');
                player2.setTotalHits(player1.getTotalHits()+1);
//                player1.setRemainingShips(player1.getRemainingShips()-1);
            }
            else
                player1.setGridAtIndex(firedByPlayer2.getX(), firedByPlayer2.getY(), 'O');
        }
    }

    public void printGameResult(Player player1, Player player2){

        player1.printGrid();
        player2.printGrid();
        System.out.println("P1:" + player1.getTotalHits());
        System.out.println("P2:" + player2.getTotalHits());
        String result;
        if(player1.getTotalHits() > player2.getTotalHits()){
            result = "Player 1 wins";
        } else if(player2.getTotalHits() > player1.getTotalHits()){
            result = "Player 2 wins";
        } else {
            result = "It is a draw";
        }
    }
}
