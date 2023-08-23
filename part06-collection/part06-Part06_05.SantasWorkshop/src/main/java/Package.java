
import java.util.ArrayList;

public class Package {
    
    private ArrayList<Gift> packaged;
    
    public Package(){
        this.packaged = new ArrayList<>();
    }
    
    public void addGift(Gift gift){
        this.packaged.add(gift);
    }
    
    public int totalWeight(){
        int weight = 0;
        for(Gift gift : this.packaged){
            weight += gift.getWeight();
        }
        return weight;
    }
}
