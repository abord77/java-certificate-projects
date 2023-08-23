
import java.util.*;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> translations;
    
    public DictionaryOfManyTranslations(){
        this.translations = new HashMap<>();
    }
    
    public void add(String word, String translation){
        this.translations.putIfAbsent(word, new ArrayList<>());
        this.translations.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word){
        if(this.translations.containsKey(word)){
            return this.translations.get(word);
        }
        return new ArrayList<>();
    }
    
    public void remove(String word){
        this.translations.remove(word, this.translations.get(word));
    }
}
