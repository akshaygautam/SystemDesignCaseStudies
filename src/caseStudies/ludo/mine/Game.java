package caseStudies.ludo.mine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private static String[] colorList = { "Green","Blue", "Yellow", "Red"  };
    private static List<Player> playerList = new ArrayList<>();
    private static Player currentPlayer;
    private static Board ludoBoard;

    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        initializePlayers();
//        initializeGame();
        runGame();
    }

    private static void runGame() {
        boolean gameCompleted = false;
        game: while (!gameCompleted) {
            ludoBoard.display();
            gameCompleted = true;
            takeTurn();
        }
    }

    private static void takeTurn() {
        System.out.println(currentPlayer +"'s turn ");
        boolean rollComplete = false;
        while (!rollComplete) {
            System.out.println("The players have to roll the dice to " + "type in \"r\".");
            String input = scanner.next();
            if (!"r".equals(input)) {
                System.out.println("Wrong input");
                continue;
            }
            rollComplete = true;
            int rolledNumber = currentPlayer.rollDice();
            boolean movesArePossible =  false;//ludoBoard.movePossible(rolledNumber, currentPlayer);
            if(!movesArePossible) {
                System.out.println("There are no possible moves. Moving on...");
                setNextPlayer();
                continue;
            }
        }
    }

    private static void setNextPlayer() {
    }

    private static void initializeGame() {
        System.out.println("The players have to roll the dice to " +
                "determine who goes first. To roll a dice, "
                + "type in \"r\".");
        boolean initComplete = false;
        int playerCounter = 0;
        while (!initComplete) {
            Player currentPlayer = playerList.get(playerCounter);
            System.out.println(currentPlayer + "'s turn.");
            String input = "a";
            try {
                input = scanner.next();
                if(input.equals("r")) {
                    currentPlayer.rollDice();
                    System.out.println(currentPlayer + " has rolled " + currentPlayer.getNumberRolled());
                } else {
                    throw  new Exception("Wrong input");
                }
            } catch(Exception e) {
                System.out.println("Something went wrong. Type in \"r\".");
            }
            if(++playerCounter==playerList.size())
                initComplete = true;
        }
    }

    private static void initializePlayers() {
        System.out.println("Welcome! Type in the number of players (2-4).");
        boolean inputCorrect = false;
        while (!inputCorrect) {
            try {
                int number = scanner.nextInt();
                inputCorrect = number > 1 && number < 5;
                if (!inputCorrect) throw new Exception("Wrong input");
                for (int i = 0; i < number; i++) {
                    playerList.add(new Player(colorList[i]));
                }
            }catch (Exception e) {
                System.out.println("Something went wrong. Type in the number of players (2-4).");
            }
        }
        for (Player player : playerList) System.out.println(player + " has joined the game.");
        currentPlayer = playerList.get(0);
        ludoBoard = new Board(playerList);
    }
}
