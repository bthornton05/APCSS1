package QuizPractice;
import java.util.Scanner;
public class VowelReplace {
    private static String input = "";
    public static void main(String[] args){
        Scanner fortniteBattlePass = new Scanner(System.in);
        input = fortniteBattlePass.nextLine();
        System.out.println(input);
        for (int i = input.length(); i >= 0; i--){
            input=input.replace("a","z");
            input=input.replace("e","z");
            input=input.replace("i","z");
            input=input.replace("o","z");
            input=input.replace("u","z");
            input=input.replace("y","q");
        }
        System.out.println(input);
        fortniteBattlePass.close();
    }
}
