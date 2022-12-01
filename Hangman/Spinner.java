package Hangman;
public class Spinner {
    private static int bet = 0;
    public int newBet(){ //Method to create a new bet/spin wheel
        bet = (int) (Math.random()*2900+100);
        return bet;
    }
    public int getBet(){ //Method for accessing bet amount
      return bet;
    }
}
