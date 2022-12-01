package Arrays;
public class Fart {
private static double[] flowerPrice = {0.75, 1.50, 1.00, 1.25};
private static int[] flowerLength ={10,15,20,25};
private static String[] flowerColor = {"Blue", "Red", "Yellow", "White", "Purple"};
public int whileFart(){
   int fortnite = 0;
    while(flowerPrice.length > fortnite){
        System.out.println(flowerPrice[fortnite]);    
        fortnite++;
    }
    return 0;
}
public int forFart(){
    for (int i = 0; i < flowerLength.length; i++){
        System.out.println(flowerLength[i]);
    }
    return 0;
}
public int enhancedFart(){
    for (String battlePass : flowerColor){
        System.out.println(battlePass);
    }
    return 0;
}
}
