package caseStudies.ludo.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class LudoGame {
    private static String[] COlORS = new String[]{"RED", "YELLOW", "GREEN", "BLUE"};
    private static List<Player> players = new ArrayList<>();
    private static Player currentPlayer;
    private static LudoBoard ludoBoard;
    private static boolean gameCompleted;

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        showMessage("Welcome! Type in the number of players (2-4).");
        initializePlayers();
        chooseTheFirstPlayer();
        runGame();
    }

    private static void runGame() {
        game: while (true) {
            ludoBoard.printBoard();
            if (rollDiceAndCheckMovePossibility()) continue;
            boolean turnComplete = false;
            while(!turnComplete) {
                Boolean commandSuccessful = takeTurn();
                if (commandSuccessful == null) continue;
                if(commandSuccessful) {
                    if(currentPlayer.hasWon()) {
                        System.out.println("Congratulations! " + currentPlayer + " has won the game!");
                        break game;
                    }

                    if(currentPlayer.hasRolledSix()) {
                        System.out.println(currentPlayer + " has rolled a six, meaning that " +
                                "they get another turn. Roll the dice.");
                        continue game;
                    }

                    setNextPlayer();
                    turnComplete = true;

                } else System.out.println("Move cannot be completed. Try something else.");
            }
        }
    }

    private static Boolean takeTurn() {
        String command = null;
        boolean commandSuccessful = false;

        try {
            command = scanner.next();
        } catch(Exception e) {
            System.out.println("Invalid command. Try again.");
            return null;
        }

        if(command.equals("t")) {

            // if did not roll 6, can't take a piece out
            if(!currentPlayer.hasRolledSix()) {
                System.out.println("Invalid move. Pieces can be taken out only " +
                        "when a 6 has been rolled.");
                return null;
            }
            Piece piece = getPieceNumber();
            if (piece == null) return null;

            commandSuccessful = ludoBoard.putPieceToStartPosition(piece);

        } else if(command.equals("m")) {
            Piece piece = getPieceNumber();
            if (piece == null) return null;
            commandSuccessful = ludoBoard.movePiece(piece, currentPlayer.getNumberRolled());
        } else {
            System.out.println("Invalid command. Try again.");
            return null;
        }
        return commandSuccessful;
    }

    private static boolean rollDiceAndCheckMovePossibility() {
        System.out.println(currentPlayer + "'s turn. The only thing you can do is roll - \"r\".");
        boolean rollComplete = false;
        while (!rollComplete) {
            rollComplete = rollCommand(null);
        }
        boolean movesArePossible = ludoBoard.movesArePossible(currentPlayer, currentPlayer.getNumberRolled());
        if (!movesArePossible) {
            showMessage("There are no possible moves. Moving on...");
            setNextPlayer();
            return true;
        }
        System.out.println(currentPlayer + " has rolled " + currentPlayer.getNumberRolled() +
                ". Commands:\n" +
                "\"t (piece number)\" without the brackets to take a piece out of the home circle;\n" +  //Type t 1 to move piece 1 out of home circle , t 2 for piece two and t 3 and so on (t(spacebar)(piece number))
                "\"m (piece number)\" without the brackets to move a piece."); //Type m 1 to move piece 1, m 2 to move piece 2, m 3 and so on (m(spacebar)(piece number))
        return false;
    }

    private static Piece getPieceNumber() {
        int pieceNumber = scanner.nextInt() - 1;
        if (pieceNumber < 0 || pieceNumber > 3) {
            System.out.println("Wrong Piece number");
            return null;
        }
        return currentPlayer.getPiece(pieceNumber);
    }

    private static void setNextPlayer() {
        int nextIndex = players.indexOf(currentPlayer) + 1;

        if(nextIndex==players.size())
            nextIndex = 0;

        currentPlayer = players.get(nextIndex);
    }

    private static boolean rollCommand(Player curr) {
        if (curr == null) curr = currentPlayer;
        try {
            String input = scanner.next();
            if (input.equals("r")) {
                curr.rollDice();
                return true;
            }
            throw new RuntimeException("Wrong input");
        } catch (Exception e) {
            System.out.println("Something went wrong. Type in \"r\".");
        }
        return false;
    }

    private static void chooseTheFirstPlayer() {
        showMessage("The players have to roll the dice to " +
                "determine who goes first. To roll a dice, "
                + "type in \"r\".");
        int playerCounter = 0;
        do {
            Player currPlayer = players.get(playerCounter);
            showMessage(currPlayer + "'s turn.");
            rollCommand(currPlayer);
        } while (++playerCounter != players.size());
        for (Player player : players) {
            showMessage(player + " has rolled " + player.getNumberRolled());
        }

        List<Player> highestRollers = determineHighestRoller(players);
        boolean onlyOneHighest = highestRollers.size()==1;

        while(!onlyOneHighest) {

            StringBuilder playerNames = new StringBuilder();

            for (Player highestRoller : highestRollers){
                playerNames.append(highestRoller).append(", ");
            }

            System.out.println("There are multiple highest rollers. Players " +
                    playerNames + "have to roll again. Remember, to " +
                    "roll a dice, type in \"r\"");

            int rollerCounter = 0;

            do {
                Player currentPlayer = highestRollers.get(rollerCounter);
                System.out.println(currentPlayer + "'s turn.");
                rollCommand(currentPlayer);
            } while (++rollerCounter!=highestRollers.size());

            for (Player highestRoller : highestRollers){
                System.out.println(highestRoller + " has rolled " + highestRoller.getNumberRolled());
            }

            highestRollers = determineHighestRoller(highestRollers);

            onlyOneHighest = highestRollers.size()==1;

        }

        currentPlayer = highestRollers.get(0);

        System.out.println(currentPlayer + " starts the game.");

        ludoBoard = new LudoBoard();
        for (Player player : players) {
            ludoBoard.initializePieces(player);
        }
    }

    private static List<Player> determineHighestRoller(List<Player> playersWhoRolled) {

        List<Player> highRollers = new ArrayList<Player>();
        Player highestRoller = playersWhoRolled.get(0);
        boolean complete = false;
        int playerCounter = 1;

        while(!complete) {

            Player nextPlayer = playersWhoRolled.get(playerCounter++);

            int currentHighest = highestRoller.getNumberRolled();
            int nextPlayersRoll = nextPlayer.getNumberRolled();

            if(currentHighest>nextPlayersRoll) {

                // do nothing, highestRoller already points
                // to the highest rolling player

            } else if(currentHighest<nextPlayersRoll) {

                // assign next player as the highest roller
                highestRoller = nextPlayer;

                // clear the multiple roller list
                // because nextPlayer has rolled
                // more than both previous players
                highRollers.clear();
            } else {

                // might already contain if there are 3
                // high rollers
                if(!highRollers.contains(highestRoller))
                    highRollers.add(highestRoller);
                if(!highRollers.contains(nextPlayer))
                    highRollers.add(nextPlayer);

            }

            if(playerCounter==playersWhoRolled.size())
                complete = true;

        }

        if(highRollers.isEmpty())
            highRollers.add(highestRoller);

        return highRollers;

    }
    private static void initializePlayers() {
        while (true) {
            try {
                int number = scanner.nextInt();
                if (number > 1 && number < 5) {
                    for (int i = 0; i < number; i++) {
                        players.add(new Player(COlORS[i]));
                    }
                    break;
                } else {
                    throw new RuntimeException("Invalid Input");
                }
            } catch (Exception e){
                showMessage("Something went wrong. Type in the number of players (2-4)." + e.getMessage());
            }
        }
        for (Player player : players) {
            showMessage(player + " has joined the game.");
        }
    }

    private static void showMessage(String s) {
        System.out.println(s);
    }
}
