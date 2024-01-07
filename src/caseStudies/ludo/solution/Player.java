package caseStudies.ludo.solution;

import java.util.Arrays;

public class Player {
    private String color;
    private int numberRolled;
    private boolean hasRolledSix;
    private Piece[] piece;

    Player(String color) {

        this.color = color;

        piece = new Piece[4];

        for(int i=0; i<4; i++)
            piece[i] = new Piece(i, color);

    }

    void rollDice() {

        // nextInt() gives an int from 0 to 5, adding 1
        // to make it in the range of 1-6
        numberRolled = new Dice().roll();

        if(numberRolled==6)
            hasRolledSix = true;
        else hasRolledSix = false;

    }

    Piece getPiece(int pieceNumber) {
        return piece[pieceNumber];
    }

    String getColor() {
        return color;
    }

    int getNumberRolled() {
        return numberRolled;
    }

    boolean hasRolledSix() {
        return hasRolledSix;
    }

    @Override
    public String toString() {
        return "Player " + color;
    }

    boolean hasWon() {
        return Arrays.stream(piece).allMatch(Piece::isCompleted);
    }
}
