package Hangman;
import java.util.Scanner;
public class Player {
    private static String p1Name = "";
    private static int p1Money = 0;
    private static String p2Name = "";
    private static int p2Money = 0;
    public void Player1(){
        Scanner pp = new Scanner(System.in); //New Player function
        System.out.println("What is your name?");
        p1Name = pp.nextLine();
        System.out.println("Welcome, " + p1Name);
        p1Money = 0;
    }
    public void Player2(){
        Scanner pp = new Scanner(System.in); 
        System.out.println("What is your name?");
        p2Name = pp.nextLine();
        System.out.println("Welcome, " + p2Name);
        p2Money = 0;
    }
    public String getP1Name(){ //Methods for returning stored name
        return p1Name;
    }
    public String getP2Name(){ 
        return p2Name;
    }
    public int yesp1Money(int mon){ //Method for afffecting money via bet/wheel
        p1Money += mon;
        return p1Money;
    }
    public int yesp2Money(int mon){ 
        p2Money += mon;
        return p2Money;
    }
    public int nop1Money(int mon){
        p1Money -= mon;
        return p1Money;
    }
    public int nop2Money(int mon){
        p2Money -= mon;
        return p2Money;
    }
    public int getp1Money(){ //Methods for returning player money
        return p1Money;
    }
    public int getp2Money(){
        return p2Money;
    }
}
