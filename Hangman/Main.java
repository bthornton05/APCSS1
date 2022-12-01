package Hangman;
import java.util.Scanner;
import java.lang.Thread;
public class Main {
    private static boolean hasGame = true; // Initialize game boolean
    private static boolean endGame = false;
    public static Spinner spinner = new Spinner(); // Initialize public spinner since it's accessed from multiple
                                                   // classes

    public static void main(String[] args) { //Main method
        Scanner fortnite = new Scanner(System.in);
        System.out.println("Hello, and welcome to:"); // Game intro
        try {
            Thread.sleep(500);
            System.out.println("CIRCLE!");
            Thread.sleep(500);
            System.out.println("OF!");
            Thread.sleep(500);
            System.out.println("WEALTH!");
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Error");
        }
        Player player1 = new Player();// Initialize players and board to start game
        Player player2 = new Player();
        Board board = new Board();
        player1.Player1();
        player2.Player2();
        board.underscorePhrase();
        while (hasGame == true) { // Game loop that loops until phrase is solved
            hasGame = false;
            if (board.getGuessPhrase().equals(board.getPhrase())) {
                hasGame = false;
                board.setTurn1(-1);
                board.setTurn2(-1);
                System.out.println("Well done, the final phrase is: " + board.getPhrase());
                System.out.println("The final numbers are: \n" + player1.getP1Name() + " with "
                        + player1.getp1Money() + " dollars.\n" + player2.getP2Name() + "with "
                        + player2.getp2Money() + " dollars.");
                System.out.println("Well done everyone, and thanks for playing on...");
                try {
                    Thread.sleep(500);
                    System.out.println("CIRCLE!");
                    Thread.sleep(500);
                    System.out.println("OF!");
                    Thread.sleep(500);
                    System.out.println("WEALTH!");
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println("Error");
                }
                endGame = true;
            } else {
                hasGame = true;
            }
            while (board.switchTurn1() == 0 && board.switchTurn2() == 1) {
                System.out.println("Ok, " + player1.getP1Name() + ". You're up.");
                spinner.newBet();
                System.out.println(
                        "Alright, lets see what you get on the wheel. Looks like " + spinner.getBet() + " dollars.");
                board.guessCounter();
                board.replaceGuess();
                if (board.getMoney() == true) { // If statement for whether or not they guess right
                    player1.yesp1Money(board.getMonAmount());
                } else {
                    player1.nop1Money(board.getMonAmount());
                }
                System.out.println("You now have " + player1.getp1Money() + " dollars.");
                if (board.getGuessPhrase().equals(board.getPhrase())) break; // well done by Abheek 💅💅💅
            }
            while (board.switchTurn2() == 0 && board.switchTurn1() == 1) {
                System.out.println("Ok, " + player2.getP2Name() + ". Your turn.");
                spinner.newBet();
                System.out.println(
                        "Alright, lets see what you get on the wheel. Looks like " + spinner.getBet() + " dollars.");
                board.guessCounter();
                board.replaceGuess();
                if (board.getMoney() == true) {
                    player2.yesp2Money(board.getMonAmount());
                } else {
                    player2.nop2Money(board.getMonAmount());
                }
                System.out.println("You now have " + player2.getp2Money() + " dollars.");
                if (board.getGuessPhrase().equals(board.getPhrase())) break; // well done by Abheek 💅💅💅
            }
        }
        if (endGame == true) {
            fortnite.close();
            System.exit(0);
        }
    }
}
