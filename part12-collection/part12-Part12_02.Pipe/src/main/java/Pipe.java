
import java.util.*;


public class Pipe<T> {
    private List<T> pipe;
    
    public Pipe(){
        this.pipe = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        this.pipe.add(value);
    }
    
    public T takeFromPipe(){
        if(this.isInPipe()){
            T temp = this.pipe.get(0);
            this.pipe.remove(0);
            return temp;
        }
        return null;
    }
    
    public boolean isInPipe(){
        return !this.pipe.isEmpty();
    }
}
