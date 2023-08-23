
import java.util.Comparator;


public class SortBySuitOrder implements Comparator<Card>{
    public int compare(Card c1, Card c2){
        return c1.getSuit().ordinal() - c2.getSuit().ordinal();
    }
}
