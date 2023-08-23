
import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    
    public Hold(int maxWeight){
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        int totalWeight = 0;
        for(Suitcase total : this.suitcases){
            totalWeight += total.totalWeight();
        }
        
        if(suitcase.totalWeight() + totalWeight <= this.maxWeight){
            suitcases.add(suitcase);
        }
    }
    
    public void printItems(){
        for(int i = 0; i < this.suitcases.size(); i++){
            this.suitcases.get(i).printItems();
        }
    }
    
    @Override
    public String toString(){
        int totalWeight = 0;
        for(Suitcase total : this.suitcases){
            totalWeight += total.totalWeight();
        }
        return this.suitcases.size() + " suitcases (" + totalWeight + " kg)";
    }
}
