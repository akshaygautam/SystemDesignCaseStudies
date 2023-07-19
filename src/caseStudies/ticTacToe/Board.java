package caseStudies.ticTacToe;

import java.util.*;

public class Board {
    private Symbol[][] board;

    public Board(int size) {
        this.board = new Symbol[size][size];
    }

    public boolean placeSymbol(int row, int col, Symbol symbol){
        if(isValidPlacement(row,col)) {
            this.board[row][col] = symbol;
            return true;
        }
        return false;
    }

    private boolean isValidPlacement(int row, int col) {
        return (row >= 0 && row < board.length) &&
                (col >= 0 && col < board[row].length) &&
                board[row][col] == null;
    }

    public boolean isWinner(Symbol symbol, int row, int col) {
        if(isRowOnlyContains(symbol,row)) return true;
        if(isColOnlyContains(symbol, col)) return true;
        return isDiagonalOnlyContains(symbol);
    }

    private boolean isDiagonalOnlyContains(Symbol symbol) {
        int rowMover = 0, colMover = 0;
        while (rowMover < this.board.length && colMover < this.board[0].length){
            Symbol s = this.board[rowMover++][colMover++];
            if(s != symbol) return false;
        }
        return true;
    }


    private boolean isColOnlyContains(Symbol symbol, int col) {
        for (int i = 0; i < this.board.length; i++) {
            Symbol s = this.board[i][col];
            if(s != symbol) return false;
        }
        return true;
    }
    private boolean isRowOnlyContains(Symbol symbol, int row) {
        for (int i = 0; i < this.board[row].length; i++) {
            Symbol s = this.board[row][i];
            if(s != symbol) return false;
        }
        return true;
    }
    
    public boolean isGameTied() {
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                if(this.board[i][j] == null) return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder boardString = new StringBuilder();
        for (Symbol[] symbols: this.board) {
            boardString.append(Arrays.toString(symbols));
            boardString.append("\n");
        }
        return boardString.toString();
    }
}
