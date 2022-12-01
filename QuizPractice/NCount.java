package QuizPractice;
import java.lang.Thread;
public class NCount {
    public static void main(String[] args){
        for (int i = 0; i<=100; i+=2){
            try{Thread.sleep(100);
            System.out.println(i);
            }
            catch(Exception e){
                System.out.println("Aww.");
            }
        }
    }
}
