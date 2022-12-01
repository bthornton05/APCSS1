package QuizPractice;
import java.util.Scanner;
public class Qnum {
    private static int numq = 0;
    public static void main(String[] args){
        Scanner fortniteBattlePass = new Scanner(System.in);
        String input = fortniteBattlePass.nextLine();
        for (int i = input.length() - 1; i >= 0; i--){
            // indq = input.indexOf("q");
            if (input.substring(i, i + 1).equals("q")) {
                numq++;
                input = input.substring(0, i) + "w" + input.substring(i + 1);
            }
            // while (indq==input.indexOf("q")){
            // numq ++;
            // input.replace(indq, "w");
        }
        System.out.println("The number of q is : "+ numq);
        System.out.println(input);
        fortniteBattlePass.close();
    }
}
