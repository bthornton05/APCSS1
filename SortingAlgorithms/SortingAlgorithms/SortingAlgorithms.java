package SortingAlgorithms;
/**
 * Avticity 3.7.6
 */
import java.util.ArrayList;

public class SortingAlgorithms
{
  /**
   * Perform a selection sort an ArrayList of integers
   * @param intList an ArrayList of integers
   * @return intList sorted from smallest to largest
   */
  public static ArrayList<Integer> selectionSortInt(ArrayList<Integer> intList)
  {
    for (int x = 0; x<intList.size()-1; x++){
      int fart = intList.get(x);
      //System.out.println(fart);
      for (int i = x+1; i<intList.size(); i++){
      //System.out.println(intList);
      if(intList.get(i) < fart){
        fart = intList.get(i);
        intList.set(i, intList.get(x));
        intList.set(x, fart);
      }
    }
  }
    return intList;
  }

  /**
   * Perform an insertion sort an ArrayList of integers
   * @param intList an ArrayList of integers
   * @return intList sorted from smallest to largest
   */
  public static ArrayList<Integer> insertionSortInt(ArrayList<Integer> intList)
  {
    for (int x = 1; x < intList.size() ; x++){
      int currentSort = intList.get(x);
      int prePosition = x-1;
      while (prePosition >= 0){
        int preCursor = intList.get(prePosition);
        if(preCursor > currentSort){
          intList.set(prePosition+1,preCursor);
          intList.set(prePosition,currentSort);
        }
        prePosition--;
      }
    }
    return intList; 
  }

  /**
   * Perform a selection sort an ArrayList of doubles
   * @param doubleList an ArrayList of doubles
   * @return doubleList sorted from smallest to largest
   */ 
  public static ArrayList<Double> selectionSortDouble(ArrayList<Double> doubleList)
  {
    for (int x = 0; x<doubleList.size()-1; x++){
      double fart = doubleList.get(x);
      //System.out.println(fart);
      for (int i = x+1; i<doubleList.size(); i++){
      //System.out.println(intList);
      if(doubleList.get(i) < fart){
        fart = doubleList.get(i);
        doubleList.set(i, doubleList.get(x));
        doubleList.set(x, fart);
      }
    }
  }
    return doubleList;
  }

  /**
   * Perform an insertion sort an ArrayList of doubles
   * @param doubleList an ArrayList of doubles
   * @return doubleList sorted from smallest to largest
   */
  public static ArrayList<Double> insertionSortDouble(ArrayList<Double> doubleList)
  {
    for (int x = 1; x < doubleList.size() ; x++){
      double currentSort = doubleList.get(x);
      int prePosition = x-1;
      while (prePosition >= 0){
        double preCursor = doubleList.get(prePosition);
        if(preCursor > currentSort){
          doubleList.set(prePosition+1,preCursor);
          doubleList.set(prePosition,currentSort);
        }
        prePosition--;
      }
    }
    return doubleList; 
  }

}