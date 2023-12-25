package caseStudies.ludo;

import java.util.Arrays;

public class Board {
    public static void main(String[] args) {
        Board board1 = new Board();

        Player[] players = new Player[2];
        players[0] = new Player("Green");
        players[1] = new Player("Blue");
        board1.initializePlayers(players);
        System.out.println(board1);
    }
    private final String[][] board;
    public Board() {
        board = new String[15][15];
        BoardHelper.designBoard(board);
    }

    public void initializePlayers(Player[] players) {
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
}
