
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        if(elements.isEmpty()){
            return "The collection " + this.name + " is empty.";
        }
        String returnVal = "";
        if(this.elements.size() ==  1){
            returnVal = "The collection " + this.name + " has " + this.elements.size() + " element:\n";
            returnVal += this.elements.get(0);
            return returnVal;
        } else{
            returnVal = "The collection " + this.name + " has " + this.elements.size() + " elements:\n";
        }
        
        for(int i = 0; i < this.elements.size(); i++){
            returnVal += this.elements.get(i) + "\n";
        }
        
        return returnVal; 
    }
    
}
