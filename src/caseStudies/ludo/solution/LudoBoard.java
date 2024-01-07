package caseStudies.ludo.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class LudoBoard {
    private Piece[][][] pieceRecord;

    public void initializePieces(Player player) {
    }

    public void printBoard() {
    }

    public boolean movesArePossible(Player currentPlayer, int numberRolled) {
        return false;
    }

    public boolean putPieceToStartPosition(Piece pieceNumber) {
        return false;
    }

    public boolean movePiece(Piece piece, int numberRolled) {
        return false;
    }
    boolean isBlocked(Piece piece, int yCoord, int xCoord) {
        List<Piece> pieceList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            Piece currentPiece  = pieceRecord[yCoord][xCoord][i];
            if(currentPiece!=null && currentPiece.getColor().equals(piece.getColor()))
                return false;
            else if(currentPiece!=null)
                pieceList.add(currentPiece);
            else break;
        }
        return pieceList.size() > 1;
    }
}
