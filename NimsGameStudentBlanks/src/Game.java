import java.util.Scanner;
public class Game {
    private int pieces;
    private Player p1;
    private Player p2;
    private Player currentPlayer;
    private Scanner sc = new Scanner(System.in);

    //Sets up the game with a random amount of pieces between 10 and 50
    //Sets up the players so they can be accessed
    public Game(Player p1, Player p2){
        pieces = (int) (Math.random()*41+10);//To Do: Grab a random value between 10 and 50
        this.p1 = p1;
        this.p2 = p2;
    }

    //Allows a player to take a specific amount of pieces.
    //Adds the amount of pieces taken to the user's score.
    public int takePiece(){
        System.out.println("There are "+ pieces+" remaining!");
        int take;
       //TO DO: Grab the user amount of pieces and repeat if it not allowed.
       take = sc.nextInt();
        if (!isLegal(take)){
            System.out.println("Try again.");
            takePiece();
        }
        else if (isLegal(take)){//TO DO: Adjust the pieces
            pieces -= take;
            if (currentPlayer == p1 ){
                p1.adjustScore(take);
            }
            else{
                p2.adjustScore(take);
            }
        }
        System.out.println("There are "+ pieces+" remaining!");
        System.out.println("-----------------------");
        return take;
    }

    
    //**TO DO**//
    public Player getNextPlayer(){
    //Changes which players turn it is and returns the current player.
       if(currentPlayer == p1){
        currentPlayer = p2;
        System.out.println(p2.getName() + "'s turn.");
        return currentPlayer;
       }
        else{
            currentPlayer = p1;
            System.out.println(p1.getName() + "'s turn.");
            return currentPlayer;
        }
    }

    //Checks whether or not the user's requested move is allowed or not.
    public boolean isLegal(int x){
        if (x <= 0){
            return false;
        }
        if (x == 1){
            return true;
        }
        if(x <= pieces/2){
            return true;
        }
        //TO DO
        else{
            return false;// Change appropriately
        }
    }


    //DO NOT CHANGE
    public boolean isComplete(){

        if (pieces == 0){ return true;}
        return false;
    }

    //DO NOT CHANGE
    public void setFirstPlayer(Player p){
        currentPlayer = p;
    }
}
