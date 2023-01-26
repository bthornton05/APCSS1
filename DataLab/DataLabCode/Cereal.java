package DataLab.DataLabCode;
public class Cereal {
    private static String name;
    private static char type;
    private static double calories;
    private static double protein;
    private static double fat;
    private static double sodium;
    private static double fiber;
    private static double carbohydrates;
    private static double sugar;
    private static double potassium;
    private static double vitamins; 
    private static int shelf;
    private static double weight;
    private static double cups;
    private static double rating;
    public Cereal(String n, char t, double cal, double pro, double fa, double so, double fi, double carb, double su, double pot, double v, int s, double w, double cup, double r){
        n = name;
        t = type;
        cal = calories;
        pro = protein;
        fa = fat;
        so = sodium;
        fi = fiber;
        carb = carbohydrates;
        su = sugar;
        pot = potassium;
        v = vitamins;
        s = shelf;
        w = weight;
        cup = cups;
        r = rating;
    }
    public String toString(String s){
        return s;
    }
    public String getName(){
        return name;
    }
    public char getType(){
        return type;
    }
    public double getCalories(){
        return calories;
    }
    public double getProtein(){
        return protein;
    }
    public double getFat(){
        return fat;
    }
    public double getSodium(){
        return sodium;
    }
    public double getFiber(){
        return fiber;
    }
    public double getCarbohydrates(){
        return carbohydrates;
    }
    public double getSugar(){
        return sugar;
    }
    public double getPotassium(){
        return potassium;
    }
    public double getVitamins(){
        return vitamins;
    }
    public int getShelf(){
        return shelf;
    }
    public double getWeight(){
        return weight;
    }
    public double getCups(){
        return cups;
    }
    public double getRating(){
        return rating;
    }
}
