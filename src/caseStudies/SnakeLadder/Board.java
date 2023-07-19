package caseStudies.SnakeLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    private Cell[][] cells;

    public Board(int size, int numberOfSnakes, int numberOfLadder){
        createBoard(size);
        addSnakes(numberOfSnakes);
        addLadders(numberOfLadder);
    }
    private void createBoard(int size) {
        cells = new Cell[size][size];
        int number = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                cells[i][j] = new Cell(number++);
            }
        }
    }

    private void addSnakes(int numberOfSnakes) {
        while (numberOfSnakes > 0 ){
            int tail = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length-1);
            int head = ThreadLocalRandom.current().nextInt(tail, cells.length* cells.length-1);
            Cell cell = getCell(head);
            if(cell.hasLadder() || cell.hasSnake() || head-tail < 10) continue;
            cell.setSnake(new Snake(head, tail));
            cell = getCell(tail);
            cell.setSnake(new Snake(head, tail));
            numberOfSnakes--;
        }

    }

    private void addLadders(int numberOfLadder) {
        while (numberOfLadder > 0 ){
            int MAX = (cells.length)*(cells.length);
            int bottom = ThreadLocalRandom.current().nextInt(1, MAX);
            int top = ThreadLocalRandom.current().nextInt(bottom, MAX);
            Cell cell = getCell(top);
            if(cell.hasLadder() || cell.hasSnake() || top-bottom < 5) continue;
            cell.setLadder(new Ladder(bottom, top));
            cell = getCell(bottom);
            cell.setLadder(new Ladder(bottom, top));
            numberOfLadder--;
        }
    }

    private Cell getCell(int position) {
        int row = position/cells.length;
        int col = (position%cells.length);
        if(row >= this.cells.length || col >= this.cells.length) return cells[cells.length-1][cells.length-1];
        return cells[row][col];
    }

    public boolean hasSnakeOrLadderOnPosition(int newPosition) {
        Cell cell = getCell(newPosition);
        return cell.isLadderBottom() || cell.isSnakeHead();
    }
    public int getNewPositionAfterSnakeBiteOrLadderClimb(int newPosition) {
        Cell cell = getCell(newPosition);
        int newPos = 0;
        if(cell.isSnakeHead()){
            newPos = cell.getSnake().bite();
        }else if(cell.isLadderBottom()){
            newPos = cell.getLadder().climb();
        }
        return newPos;
    }

    public int getFinishPosition() {
        return this.cells.length * this.cells.length;
    }
}
