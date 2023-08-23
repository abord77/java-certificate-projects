
import java.util.ArrayList;


public class BoxWithMaxWeight extends Box{
    private int maxCapacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity){
        this.maxCapacity = capacity;
        this.items = new ArrayList<>();
    }
    
    @Override
    public void add(Item item){
        int currentWeight = 0;
        for(Item add : items){
            currentWeight += add.getWeight();
        }

        if(currentWeight + item.getWeight() <= this.maxCapacity){
            items.add(item);
        }
    }
    
    @Override
    public boolean isInBox(Item item){
        return this.items.contains(item);
    }
}
