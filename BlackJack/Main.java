package BlackJack;

import java.util.Scanner;
class Main {
  private static boolean gameEnd = false;
  public static void main(String[] args) {
    Scanner gameChoice = new Scanner(System.in);
    while (gameEnd == false){
      System.out.println("Would you like to play blackjack? y/n");
    String game = gameChoice.nextLine();
    if (game.equals("y")){
      gameEnd = true;
      System.out.println("You currently have a " + p1Card + "and a " + p2Card + "totalling " + );
    }
    else if (game.equals("n")){
      gameEnd = true;
      System.out.println("Okay, bye.");
      System.exit(0);
    }
    else{
      System.out.println("Try again.");
    }
    }
  }
}