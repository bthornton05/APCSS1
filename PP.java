public class PP {
    private static int[] itemsSold = {48, 50, 37, 62, 38, 70, 55, 37, 64, 60};
    private static double[] wages = {1,2,3,4,5,6,7,8,9,10};
    private static double bonusThreshold = 0;
    private static double maxVal = itemsSold[0];
    private static double minVal = itemsSold[0];
    public static void main(String[] args){
        computeWages(10.0, 1.5);
    }
    public static double computeBonusThreshold(){
        for (double x : itemsSold){
            if(x> maxVal){
                maxVal = x;
            }
            if(x < minVal){
                minVal = x;
            }
            bonusThreshold += x;
        }
        bonusThreshold = (bonusThreshold - minVal - maxVal) / (itemsSold.length - 2);
        return bonusThreshold;
    }
public static void computeWages(double fixedWage, double perItemWage){
    int index = 0;
    for (double y : itemsSold){
        if (y > computeBonusThreshold()){
            wages[index] = (fixedWage + (perItemWage * y)) * 1.1;
        }
        else {
            wages[index] = fixedWage + (perItemWage * y);
        }
        index++;
    }
    }
}
        
