
import java.util.ArrayList;


public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int maxWeight){
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item){
        if(item.getWeight() + totalWeight() <= this.maxWeight){
            items.add(item);
        }
    }
    
    public void printItems(){
        for(Item print : this.items){
            System.out.println(print);
        }  
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for(Item total : this.items){
            totalWeight += total.getWeight();
        }
        return totalWeight;
    }
    
    public Item heaviestItem(){
        if(this.items.isEmpty()){
            return null;
        }
        
        Item returnObj = this.items.get(0);
        for(Item temp : this.items){
            if(temp.getWeight() > returnObj.getWeight()){
                returnObj = temp;
            }
        }
        return returnObj;
    }
    
    @Override
    public String toString(){
        if(this.items.size() == 0){
            return "no items (0 kg)";
        }

        if(this.items.size() == 1){
            return this.items.size() + " item (" + totalWeight() + " kg)";
        } else{
            return this.items.size() + " items (" + totalWeight() + " kg)";
        }
    }
}
