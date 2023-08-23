
import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviationList;
    
    public Abbreviations(){
        this.abbreviationList = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation){
        this.abbreviationList.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation){
        return this.abbreviationList.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation){
        return this.abbreviationList.get(abbreviation);
    }
}
