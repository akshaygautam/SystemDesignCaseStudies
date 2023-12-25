package caseStudies.ludo;

public class Piece {
    private final String color;

    private final int pieceNumber;
    private int[] position;
    private boolean inGame;

    private boolean completed;

    public Piece(String color, int pieceNumber) {
        this.color = color;
        this.pieceNumber = pieceNumber;
    }

    public String getColor() {
        return color;
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    public boolean isInGame() {
        return inGame;
    }

    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

}
