package ChildrensLibrary;
/*
 * Activity 3.7.5
 */
import java.util.ArrayList;

public class LibraryRunner
{
  private static String authorToFind = "L. Frank Baum";
  private static String bookToFind = "Sky Island";
  private static double minimumRating = 0.0;
  public static void main(String[] arg)
  {
    Library library = new Library();
    ArrayList<Book> dooDooFard = library.getChildrensBooks();
    for (Book x: dooDooFard){
      if(x.getAuthor().equals(authorToFind)){
        System.out.println(x.getTitle());
      }
    }
    for (Book j : dooDooFard){
      if(j.getTitle().equals(bookToFind)){
        minimumRating = j.getRating();
        //System.out.println(minimumRating);
      }
    }
    for (Book p : dooDooFard){
      if(minimumRating <= p.getRating()){
        System.out.println(p.getTitle() + " by " + p.getAuthor());
      }
    }
  }
}