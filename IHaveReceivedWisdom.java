import java.lang.Thread;
public class IHaveReceivedWisdom {
    private static String fart = "fart";
    private static int pp;
    private static boolean awesomeness = true;
    public static void main (String[] args){
        while (awesomeness == true){
        boolean start = true;
        if (start == true){
            pp = -8;
            for (int x = 0; x<33 ; x++){
                try{
                    System.out.println(fart);
                    Thread.sleep(35);
                    //System.out.println(pp);
                    fart = "    " + fart;
                    pp +=4;
                }
                catch(Exception e){
                    System.out.println("Error");
                }
        }
        start = false;
        //System.out.println(pp);
    }
            if(start == false){
                for (int y = 33; y > 0 ; y--){
                    try{
                        fart = fart.substring(0,pp) + "fart";
                        Thread.sleep(35);
                        System.out.println(fart);
                        pp -=4;
                    }
                    catch(Exception e){
                    }
                }
            }
        }
}
}
