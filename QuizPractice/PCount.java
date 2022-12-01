package QuizPractice;
import java.lang.Thread;
public class PCount {
    public static void main(String[] args){
        for (int i = 100; i>=0; i--){
            try{
            System.out.println(i);
            Thread.sleep(100);
        }
        catch(Exception e){
            System.out.println("Aww");
        }
    }
}
}
