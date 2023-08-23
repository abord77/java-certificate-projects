
import java.util.ArrayList;


public class Herd implements Movable{
    private ArrayList<Movable> organisms;
    
    public Herd(){
        this.organisms = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        this.organisms.add(movable);
    }
    
    public String toString(){
        String returnVal = "";
        for(Movable organism : organisms){
            returnVal += organism.toString() + "\n";
        }
        return returnVal;
    }
    
    public void move(int dx, int dy){
        for(Movable organism : organisms){
            organism.move(dx, dy);
        }
    }
}
