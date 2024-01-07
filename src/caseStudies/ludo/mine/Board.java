package caseStudies.ludo.mine;

import java.util.Arrays;
import java.util.List;

public class Board {
    private final String[][] board;
    public Board(List<Player> players) {
        board = new String[15][15];
        BoardHelper.designBoard(board);
        for (Player player: players) {
            BoardHelper.markRestArea(board, player.getColor());
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String[] row: board) {
            stringBuilder.append(Arrays.toString(row));
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void display() {
        System.out.println(this);
    }
}
