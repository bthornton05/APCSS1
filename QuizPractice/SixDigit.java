package QuizPractice;
public class SixDigit{
private static double rNum;
private static int pp;
private static String stringNum = "";
private static String finalNum = "";
public static void main(String[] args){
    for (int i = 5; i>=0; i--){
    rNum = Math.random()*10; 
    pp = (int)rNum;
    stringNum = String.valueOf(pp);
    finalNum += stringNum;
    }
    System.out.println(finalNum);
}
}