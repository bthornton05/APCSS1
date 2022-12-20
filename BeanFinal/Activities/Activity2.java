package BeanFinal.Activities;
/*Farmer Owen Levinson Gould wants to buy fertilizer for his soybean field. Assuming a field acreage of 15 acres and a average bushel rate of 60 per acre,
 * how much fertlizer should Owen use? Remember, that, per bushel, soybeans remove 1.15 pounds of K₂O, so 60 bushels will remove 69 pounds of K₂O per acre.
 * However, muriate of potash, the fertilizer used on Owen's field, contains only about 60 percent K₂O by mass, meaning 115 pounds of muriate of potash(0-0-60)
 * must be used per acre. However, Owen Levinson Gould is not a precise farmer, and fertilized his field at random. Finish the boolean expression to check if 
 * Owen adequately fertilized his fields.
*/
public class Activity2 {
    private static int fertlizer = (int)(Math.random()*1325 + 500);
    public static void main(String[] args){
        System.out.println("The amount of fertilizer added is: " + /*Write code here*/ + " pounds.");
        System.out.println(/*Write code here to check if he has enough fertlizer, remember your operators and make sure to calculate the fertlizer needed*/);
    }
}
