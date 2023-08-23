
import java.util.ArrayList;


public class Box implements Packable{
    private ArrayList<Packable> items;
    private double maxCapacity;
    
    public Box(double maximumCapacity){
        this.maxCapacity = maximumCapacity;
        this.items = new ArrayList<>();
    }
    
    public void add(Packable item){
        double totalWeight = 0;
        for(Packable weight : items){
            totalWeight += weight.weight();
        }
        
        if(totalWeight + item.weight() <= this.maxCapacity){
            this.items.add(item);
        }
    }
    
    public double weight() {
        double totalWeight = 0;
        for(Packable weight : items){
            totalWeight += weight.weight();
        }
        
        return totalWeight;
    }
    
    public String toString(){
        return "Box: " + items.size() + " items, total weight " + this.weight() + " kg";
    }
}
