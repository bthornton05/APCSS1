/*
 * Activity 3.7.3
 */
import java.util.ArrayList;
public class HorseBarnRunner
{
  public static void main(String[] args) //Thanks to Aric and Abheek for explaining many a thing
  {
    HorseBarn barn = new HorseBarn();
    //ArrayList<Horse> barnSpaces = new ArrayList<Horse>();
    //barnSpaces = barn.getSpaces();
   // for (Horse h : barnSpaces){
      //System.out.println(barnSpaces.toString());
      ArrayList<Horse> fartPrime = RandomPermutation.next(barn.getSpaces());
      System.out.println(fartPrime);
      if (fartPrime.size() % 2 != 0){
        fartPrime.add(new Horse("no maidens",0));
      }
      for (int p = 0; p<fartPrime.size() ; p += 2){
        System.out.println(fartPrime.get(p) + " and " + fartPrime.get(p + 1));
      }
    }

  }