package ConsumerLab.ConsumerLab_;
public class Main {
    public static void main(String[] args){
    System.out.println(Review.sentimentVal("happily"));
    System.out.println(Review.sentimentVal("terrible"));
    System.out.println(Review.sentimentVal("cold"));
    Review.totalSentiment("/workspace/IAmGod/ConsumerLab/ConsumerLab_/SimpleReview.txt");
    Review.starRating("/workspace/IAmGod/ConsumerLab/ConsumerLab_/SimpleReview.txt");
    }
}
