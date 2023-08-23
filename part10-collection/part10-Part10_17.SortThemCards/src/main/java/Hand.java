
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Hand implements Comparable<Hand>{
    private List<Card> cards;
    
    public Hand(){
        this.cards = new ArrayList<>();
    }
    
    public void add(Card card){
        this.cards.add(card);
    }
    
    public void print(){
        for(Card print : cards){
            System.out.println(print);
        }
    }
    
    public void sort(){
        Collections.sort(cards);
    }
    
    public void sortBySuit(){
        Collections.sort(cards, new BySuitInValueOrder());
    }
    
    public int compareTo(Hand object){
        int thisHandSum = 0;
        int objectHandSum = 0;
        for(Card sum : this.cards){
            thisHandSum += sum.getValue();
        }
        for(Card sum : object.cards){
            objectHandSum += sum.getValue();
        }
        
        if(thisHandSum > objectHandSum){
            return 1;
        } else if(thisHandSum < objectHandSum){
            return -1;
        }
        return 0;
    }
}
