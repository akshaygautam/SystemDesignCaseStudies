package caseStudies.ticTacToe;

import java.util.*;

public class Player {
    private String id;
    private Symbol symbol;
    private static final Scanner s = new Scanner(System.in);
    public Player(String id, Symbol symbol) {
        this.id = id;
        this.symbol = symbol;
    }

    public boolean takeTurn(Board board){
        System.out.println("Player taking turn "+ this);
        System.out.printf("Enter coordinates: ");
        int row = s.nextInt();
        int col = s.nextInt();
        boolean moveSuccess = board.placeSymbol(row,col, symbol);
        if(moveSuccess) {
            return board.isWinner(symbol, row, col);
        }
        throw new IllegalArgumentException("Wrong input by player: "+this);
    }

    @Override
    public String toString() {
        return id +" with symbol=" + symbol;
    }
}
