package QuizPractice;
import java.util.Scanner;
public class Modulo {
    private static double fNum;
    private static double sNum;
    public static void main(String[] args){
        Scanner fortniteBattlePass= new Scanner(System.in);
        fNum = fortniteBattlePass.nextDouble();
        sNum = fortniteBattlePass.nextDouble();
        fortniteBattlePass.close();
        if (fNum % sNum == 0){
            System.out.println("Yay");
        }
        else if(fNum % sNum != 0){
            System.out.println("Nay");
        }
        else{
            System.out.println("Error");
        }
    }
    
}
