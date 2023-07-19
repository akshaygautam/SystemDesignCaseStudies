package caseStudies.SnakeLadder;

public class Cell {
    private final int number;
    private Snake snake;
    private Ladder ladder;

    public Cell(int number) {
        this.number = number;
    }

    public boolean hasLadder(){
        return this.ladder != null;
    }

    public boolean hasSnake(){
        return this.snake != null;
    }
    public boolean isSnakeHead(){
        return this.snake != null && this.snake.getHead() == this.number;
    }

    public boolean isLadderBottom(){
        return this.ladder != null && this.ladder.getBottom() == this.number;
    }

    private int placePlayer(){
        return number;
    }

    public int getNumber() {
        return number;
    }

    public Snake getSnake() {
        return snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public Ladder getLadder() {
        return ladder;
    }

    public void setLadder(Ladder ladder) {
        this.ladder = ladder;
    }
}
