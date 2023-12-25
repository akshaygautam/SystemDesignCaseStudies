package caseStudies.ludo;

import java.util.*;

public class BoardHelper {
    public static final Set<String> finishArea = new HashSet<>();
    public static final Map<String,String> piecesInitialPosition = new HashMap<>();
    public static final Set<String> wasteLand = new HashSet<>();

    public static Map<String, List<int[]>> travelPaths = new HashMap<>();
    public static void designBoard(String[][] board) {
        markFinishArea(board);
        initializePieceInitialPos();
        markPath(board);
        setTraverPath(board);
    }

    private static void markFinishArea(String[][] board) {
        for (int i = 6; i <= 8 ; i++) {
            for (int j = 6; j <= 8 ; j++) {
                board[i][j] = "##";
                finishArea.add(i+"$"+j);
            }
        }
        wasteLand.addAll(finishArea);
    }

    private static void markPath(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                String key = i+"$"+j;
                if(wasteLand.contains(key)) continue;
                board[i][j] = "--";
                if ((i==7 && j!=0) || (i!=0 && j ==7)) {
                    wasteLand.add(key);
                    board[i][j] = "**";
                }
            }
        }
    }

    public static void markRestArea(String[][] board, String color) {
        switch (color) {
            case "Green" -> {
                for (int i = 0; i <= 5; i++) {
                    for (int j = 0; j <= 5; j++) {
                        markInitials(i, j, board);
                    }
                }
            }
            case "Yellow" -> {
                for (int i = 0; i <= 5; i++) {
                    for (int j = 9; j <= 14; j++) {
                        markInitials(i, j, board);
                    }
                }
            }
            case "Red" -> {
                for (int i = 9; i <= 14; i++) {
                    for (int j = 0; j <= 5; j++) {
                        markInitials(i, j, board);
                    }
                }
            }
            case "Blue" -> {
                for (int i = 9; i <= 14; i++) {
                    for (int j = 9; j <= 14; j++) {
                        markInitials(i, j, board);
                    }
                }
            }
        }
    }

    private static void markInitials(int row, int col, String[][] board) {
        String key = row +"$"+col;
        wasteLand.add(key);
        board[row][col] = piecesInitialPosition.getOrDefault(key,"  ");
    }

    private static void initializePieceInitialPos() {
        piecesInitialPosition.put("2$2","G1");
        piecesInitialPosition.put("2$3","G2");
        piecesInitialPosition.put("3$2","G3");
        piecesInitialPosition.put("3$3","G4");
        piecesInitialPosition.put("2$11","Y1");
        piecesInitialPosition.put("2$12","Y2");
        piecesInitialPosition.put("3$11","y3");
        piecesInitialPosition.put("3$12","y4");
        piecesInitialPosition.put("11$2","R1");
        piecesInitialPosition.put("12$2","R2");
        piecesInitialPosition.put("11$3","R3");
        piecesInitialPosition.put("12$3","R4");
        piecesInitialPosition.put("11$11","B1");
        piecesInitialPosition.put("11$12","B2");
        piecesInitialPosition.put("12$11","B3");
        piecesInitialPosition.put("12$12","B4");
        wasteLand.addAll(piecesInitialPosition.keySet());
    }

    private static void setTraverPath(String[][] board) {
        travelPaths.put("Green",new ArrayList<>());
        travelPaths.put("Yellow",new ArrayList<>());
        travelPaths.put("Blue",new ArrayList<>());
        travelPaths.put("Red",new ArrayList<>());
        setGreenPath(board, travelPaths.get("Green"));
        setYellowPath(board, travelPaths.get("Yellow"));
        setBluePath(board, travelPaths.get("Blue"));
        setRedPath(board, travelPaths.get("Red"));
    }

    private static void setRedPath(String[][] board, List<int[]> path) {
        startRed(path);
        startGreen(path);
        startYellow(path);
        startBlue(path);
        path.remove(path.size()-1);
        path.add(new int[]{9,7});
        path.add(new int[]{10,7});
        path.add(new int[]{11,7});
        path.add(new int[]{12,7});
        path.add(new int[]{13,7});
        path.add(new int[]{14,7});
    }

    private static void setBluePath(String[][] board, List<int[]> path) {
        startBlue(path);
        startRed(path);
        startGreen(path);
        startYellow(path);
        path.remove(path.size()-1);
        path.add(new int[]{7,13});
        path.add(new int[]{7,12});
        path.add(new int[]{7,11});
        path.add(new int[]{7,10});
        path.add(new int[]{7,9});
    }
    private static void setYellowPath(String[][] board, List<int[]> path) {
        startYellow(path);
        startBlue(path);
        startRed(path);
        startGreen(path);
        path.remove(path.size()-1);
        path.add(new int[]{0,7});
        path.add(new int[]{1,7});
        path.add(new int[]{2,7});
        path.add(new int[]{3,7});
        path.add(new int[]{4,7});
        path.add(new int[]{5,7});
    }
    private static void setGreenPath(String[][] board, List<int[]> path) {
        startGreen(path);
        startYellow(path);
        startBlue(path);
        startRed(path);
        path.remove(path.size()-1);
        path.add(new int[]{7,1});
        path.add(new int[]{7,2});
        path.add(new int[]{7,3});
        path.add(new int[]{7,4});
        path.add(new int[]{7,5});
    }

    private static void startRed(List<int[]> path) {
        path.add(new int[]{13,6});
        path.add(new int[]{12,6});
        path.add(new int[]{11,6});
        path.add(new int[]{10,6});
        path.add(new int[]{9,6});
        path.add(new int[]{8,5});
        path.add(new int[]{8,4});
        path.add(new int[]{8,3});
        path.add(new int[]{8,2});
        path.add(new int[]{8,1});
        path.add(new int[]{8,0});
        path.add(new int[]{7,0});
        path.add(new int[]{6,0});
    }

    private static void startBlue(List<int[]> path) {
        path.add(new int[]{8,13});
        path.add(new int[]{8,12});
        path.add(new int[]{8,11});
        path.add(new int[]{8,10});
        path.add(new int[]{8,9});
        path.add(new int[]{9,8});
        path.add(new int[]{10,8});
        path.add(new int[]{11,8});
        path.add(new int[]{12,8});
        path.add(new int[]{13,8});
        path.add(new int[]{14,8});
        path.add(new int[]{14,7});
        path.add(new int[]{14,6});
    }

    private static void startYellow(List<int[]> path) {
        path.add(new int[]{1,8});
        path.add(new int[]{2,8});
        path.add(new int[]{3,8});
        path.add(new int[]{4,8});
        path.add(new int[]{5,8});
        path.add(new int[]{6,9});
        path.add(new int[]{6,10});
        path.add(new int[]{6,11});
        path.add(new int[]{6,12});
        path.add(new int[]{6,13});
        path.add(new int[]{6,14});
        path.add(new int[]{7,14});
        path.add(new int[]{8,14});
    }

    private static void startGreen(List<int[]> path) {
        path.add(new int[]{6,1});
        path.add(new int[]{6,2});
        path.add(new int[]{6,3});
        path.add(new int[]{6,4});
        path.add(new int[]{6,5});
        path.add(new int[]{5,6});
        path.add(new int[]{4,6});
        path.add(new int[]{3,6});
        path.add(new int[]{2,6});
        path.add(new int[]{1,6});
        path.add(new int[]{0,6});
        path.add(new int[]{0,7});
        path.add(new int[]{0,8});
    }

}
