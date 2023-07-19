package caseStudies.SnakeLadder;

import java.util.*;

public class Player {
    private String id;
    private int position;

    public Player(String id, int position) {
        this.id = id;
        this.position = position;
    }

    public String getId() {
        return id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int takeTurn(Board board, Dice dice){
        int newPosition = this.position + dice.rollDice();
        while (board.hasSnakeOrLadderOnPosition(newPosition)){
            newPosition = board.getNewPositionAfterSnakeBiteOrLadderClimb(newPosition);
        }
        this.position = newPosition;
        System.out.println(this);
        return this.position;
    }

    @Override
    public String toString() {
        return "Player " + id + " is at position " + position;
    }
}
