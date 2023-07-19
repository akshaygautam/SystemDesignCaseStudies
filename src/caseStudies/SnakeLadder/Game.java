package caseStudies.SnakeLadder;

import java.util.*;

public class Game {
    private Board board;
    private Dice dice;
    private Deque<Player> players;

    private Player winner;

    public Game() {
        prepareGame(10, 12, 8, 2, 1);
    }

    private void prepareGame(int boardSize, int numberOfSnakes, int numberOfLadders, int numberOfPlayers, int diceCount) {
       this.board = new Board(boardSize, numberOfSnakes, numberOfLadders);
       this.dice = new Dice(diceCount);
       this.winner = null;
       this.players = new LinkedList<>();
       while (numberOfPlayers-- > 0){
           this.players.add(new Player("p"+numberOfPlayers, 0));
       }
    }

    public void startGame(){
        while (winner == null){
            Player player = findWhichPlayerHasTurn();
            System.out.println("Player turn => "+ player);
            int position = player.takeTurn(board, dice);
            if(position >= board.getFinishPosition()){
                this.winner = player;
                break;
            }
        }
        System.out.println("WINNER IS : "+ this.winner);
    }

    private Player findWhichPlayerHasTurn() {
        Player player = this.players.removeFirst();
        this.players.addLast(player);
        return player;
    }
}
