package caseStudies.ticTacToe;

import java.util.*;

public class Game {
    private Board board;
    private Deque<Player> players;
    public Game() {
        prepareGame(3, 2);
    }

    private void prepareGame(int boardSize, int playerCount) {
        this.board = new Board(boardSize);
        this.players = new LinkedList<>();
        this.players.add(new Player("P1", Symbol.CIRCLE));
        this.players.add(new Player("P2", Symbol.CROSS));
    }

    public void startGame(){
        boolean isWinner = false;
        while (!isWinner) {
            System.out.println(this.board);
            Player player = this.players.poll();
            try {
                isWinner =  player.takeTurn(this.board);
            } catch (IllegalArgumentException exception) {
                if(board.isGameTied()) break;
                System.out.println(exception.getMessage());
                players.addFirst(player);
                continue;
            }
            if(isWinner) {
                System.out.println(this.board);
                System.out.println("Player won: "+player);
            }
            players.addLast(player);
        }
    }
}
