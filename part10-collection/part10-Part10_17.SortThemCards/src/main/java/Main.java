
import java.util.*;



public class Main {

    public static void main(String[] args) {
BySuitInValueOrder comparator = new BySuitInValueOrder();
        Card first = new Card(3,Suit.CLUB);
Card second = new Card(2,Suit.SPADE);
        System.out.println(comparator.compare(first,second));
    }
}
