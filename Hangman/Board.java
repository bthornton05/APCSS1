package Hangman;

import java.util.Scanner;
import java.io.File;

public class Board {
  private static String completeString = "";
  private static String guessString = ""; // Variables for game methods
  private static String currentString = "";
  private static String underscoreString = "";
  private static String ppString = "";
  private static String letterString = "";
  private static String alp = "abcdefghijklmnopqrstuvwxyz";
  private static String currentLetter = "";
  private static String currentGuess = "";
  private static int betAmount = 0;
  private static int letterLocation = 0;
  private static boolean money = false;
  private static int switchPlayer1 = 0;
  private static int switchPlayer2 = 1;
  private String loadPhrase() {
    String tempPhrase = "";
    int numOfLines = 0;
    tempPhrase = "how are you";
    try {
      Scanner sc = new Scanner(new File("/workspace/IAmGod/Hangman/phrases.txt"));
      while (sc.hasNextLine()) {
        tempPhrase = sc.nextLine().trim();
        numOfLines++;
      }
    } catch (Exception e) {
      System.out.println("Error reading or parsing phrases.txt");
    }

    int randomInt = (int) ((Math.random() * numOfLines) + 1);
    try {
      int count = 0;
      Scanner sc = new Scanner(new File("/workspace/IAmGod/Hangman/phrases.txt"));
      while (sc.hasNextLine()) {
        count++;
        String temp = sc.nextLine().trim();
        if (count == randomInt) {
          tempPhrase = temp;
          completeString = tempPhrase; // Setting values for strings used in other methods
          currentString = tempPhrase;
          guessString = tempPhrase;
        }
      }
    } catch (Exception e) {
      System.out.println("Error reading or parsing phrases.txt");
    }
    return tempPhrase;
  }

  public String underscorePhrase() { // Replaces loaded phrase with underscores for game, called at game
                                     // initialization
    loadPhrase();
    // System.out.println(currentString);
    for (int i = 0; i < alp.length(); i++) {
      currentLetter = alp.substring(i, i + 1);
      for (int j = 0; j < currentString.length(); j++) {
        if (currentLetter.equals(currentString.substring(j, j + 1))) {
          currentString = currentString.replace(currentString.substring(j, j + 1), "_");
          underscoreString = currentString;
        }
      }
    }
    System.out.println("Alright, the first phrase is: ");
    System.out.println(underscoreString);
    return underscoreString;
  }

  public String samReplace() { // Sam's "better" way of making underscores, I don't think I'll use it, just
                               // here for learning purposes
    String phraseToReplace = "opposites attract", newPhrase = "";
    for (int i = 0; i < phraseToReplace.length(); i++) {
      String currentLetter = phraseToReplace.substring(i, i + 1);
      if (!currentLetter.equals(" ")) {
        newPhrase += "_";
      } else {
        newPhrase += " ";
      }
    }
    return newPhrase;
  }

  public String replaceGuess() { // Method for replacing letters guessed by player, called repeatedly for turns
    Scanner pp = new Scanner(System.in);
    Spinner spinner = Main.spinner;
    //System.out.println(guessString);
    System.out.println(underscoreString);
    System.out.println("So what's your guess?");
    currentGuess = pp.nextLine();
    if (letterString.contains(currentGuess)) { // Already guessed letter
      System.out.println("Sorry, that's already been guessed.");
      replaceGuess();
    }
    currentGuess = currentGuess.toLowerCase();
    currentGuess = currentGuess.substring(0,1);
    letterString += currentGuess;
    ppString = guessString;
    System.out.println("Show me: " + currentGuess);
    if (guessString.contains(currentGuess)) { // Correct guess, replaces letter
      // System.out.println("It contains it");
      while (ppString.contains(currentGuess)) { // It will always contain the letter, loop broken, make
                                                                // a new string and replace the letters with another
                                                                // character
        letterLocation = ppString.indexOf(currentGuess);
        ppString = ppString.substring(0, letterLocation) + "." + ppString.substring(letterLocation + 1);
        //System.out.println(ppString);
        underscoreString = underscoreString.substring(0, letterLocation) + currentGuess
            + underscoreString.substring(letterLocation + 1);
      }
      System.out.println(underscoreString);
      System.out.println("Well done, thats " + Main.spinner.getBet() + " dollars.");
      betAmount = Main.spinner.getBet();
      money = true;
      if(switchPlayer1 == 0 && switchPlayer2 == 1){
        switchPlayer1 = 0;
        switchPlayer2 = 1;
      } 
      else if(switchPlayer2 == 0 && switchPlayer1 == 1){
        switchPlayer2 = 0;
        switchPlayer1 = 1;
      } 
    } else { // Incorrect answer
      System.out.println("Sorry, thats incorrect. There goes " + Main.spinner.getBet() + " dollars.");
      System.out.println(underscoreString);
      betAmount = Main.spinner.getBet();
      money = false;
      if(switchPlayer1 == 0 && switchPlayer2 == 1){
        switchPlayer2 = 0;
        switchPlayer1 = 1;
      } 
      else if(switchPlayer2 == 0 && switchPlayer1 == 1){
        switchPlayer1 = 0;
        switchPlayer2 = 1;
    }
  }
  return underscoreString;
}

  public String guessCounter() { // Method for current letters guessed
    System.out.println("Current guesses so far: " + letterString);
    return letterString;
  }

  public String getGuessPhrase() { // Accessors for other classes
    return underscoreString;
  }

  public String getPhrase() {
    return completeString;
  }

  public int getMonAmount() {
    return betAmount;
  }

  public boolean getMoney() {
    return money;
  }
  public int switchTurn1() { //Mutators for changing turns
    return switchPlayer1;
  }
  public int switchTurn2() {
    return switchPlayer2;
  }
  public int setTurn1(int p) {
    switchPlayer1 = p;
    return switchPlayer1;
  }
  public int setTurn2(int z) {
    switchPlayer2 = z;
    return switchPlayer2;
  }
}