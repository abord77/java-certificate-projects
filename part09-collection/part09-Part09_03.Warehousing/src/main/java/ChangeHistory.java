
import java.util.ArrayList;
import java.util.Collections;


public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory(){
        this.history = new ArrayList<>();
    }
    
    public void add(double status){
        this.history.add(status);
    }
    
    public void clear(){
        this.history.clear();
    }
    
    public double maxValue(){
        if(this.history.size() == 0){
            return 0;
        }
        double maxVal = 0;
        for(double max : this.history){
            if(max > maxVal){
                maxVal = max;
            }
        }
        return maxVal;
    }
    
    public double minValue(){
        if(this.history.size() == 0){
            return 0;
        }
        double minVal = 100000;
        for(double min : this.history){
            if(min < minVal){
                minVal = min;
            }
        }
        return minVal;
    }
    
    public double average(){
        if(this.history.size() == 0){
            return 0;
        }
        double average = 0;
        for(double add : this.history){
            average += add;
        }
        return average / this.history.size();
    }
    
    public String toString(){
        return this.history.toString();
    }
}
