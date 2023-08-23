
public class Birds {
    private String name;
    private String latinName;
    private int sightings;
    
    public Birds(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.sightings = 0;
    }
    
    public void observation(){
        this.sightings++;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String toString(){
        return this.name + " (" + this.latinName + "): " + this.sightings + " observations";
    }
}
