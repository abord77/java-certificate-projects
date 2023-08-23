
import java.util.ArrayList;


public class Recipe {
    private String name;
    private int cookTime;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int cookTime){
        this.name = name;
        this.cookTime = cookTime;
        this.ingredients = new ArrayList<>();
    }
    
    public void add(String ingredient){
        this.ingredients.add(ingredient);
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getCookTime(){
        return this.cookTime;
    }
    
    public boolean recipeContains(String ingredient){
        for(String check : ingredients){
            if(check.equals(ingredient)){
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString(){
        return this.name + ", cooking time: " + this.cookTime;
    }
}
