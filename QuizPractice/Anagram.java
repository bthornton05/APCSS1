package QuizPractice;
import java.util.Scanner;
public class Anagram {
    private static String fWord = "";
    private static String sWord = "";
    private static boolean pp=true;
    private static String alp= "abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args){
        Scanner fortniteBattlePass = new Scanner(System.in);
        fWord = fortniteBattlePass.nextLine().toLowerCase();
        sWord = fortniteBattlePass.nextLine().toLowerCase();
        fortniteBattlePass.close();
        if (fWord.length() == sWord.length()){
        for (int i = 0; i<alp.length(); i++){
        String currentLetter = alp.substring(i,i+1);
        int fNum = 0;
        int sNum = 0;
        for (int j = 0; j<fWord.length(); j++){
            if (currentLetter.equals(fWord.substring(j, j+1))){
                fNum ++;
            }
            if (currentLetter.equals(sWord.substring(j, j+1))){
                sNum ++;
            }
        }
        if (fNum != sNum){
            pp = false;
        }
    }
        }
else if(fWord.length() != sWord.length()){
    pp = false;
}
if (pp == true){
    System.out.println("Yay");
}
else if (pp == false){
    System.out.println("Nay");
}
}
}
