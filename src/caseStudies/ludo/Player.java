package caseStudies.ludo;

import java.util.Arrays;

public class Player {
    private final String color;
    private final Piece[] pieces;
    private int numberRolled;
    private boolean hasRolled6;

    public Player(String color) {
        this.color = color;
        this.pieces = new Piece[4];
        for (int i = 0; i < this.pieces.length; i++) {
            this.pieces[i] = new Piece(color, i+1);
        }
    }

    public boolean hasWon(){
        return Arrays.stream(pieces).allMatch(Piece::isCompleted);
    }

    public void rollDice() {
        this.numberRolled = Dice.Instance.roll();
        this.hasRolled6 = this.numberRolled == 6;
    }
    public String getColor() {
        return color;
    }

    public Piece[] getPieces() {
        return pieces;
    }

    public int getNumberRolled() {
        return numberRolled;
    }

    public void setNumberRolled(int numberRolled) {
        this.numberRolled = numberRolled;
    }

    public boolean isHasRolled6() {
        return hasRolled6;
    }

    public void setHasRolled6(boolean hasRolled6) {
        this.hasRolled6 = hasRolled6;
    }

    @Override
    public String toString() {
        return "Player " + color;
    }
}
