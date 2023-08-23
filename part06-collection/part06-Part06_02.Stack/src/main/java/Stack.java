
import java.util.ArrayList;


public class Stack {
    private ArrayList<String> stack;
    
    public Stack(){
        this.stack = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    
    public void add(String value){
        stack.add(value);
    }
    
    public ArrayList<String> values(){
        return this.stack;
    }
    
    public String take(){
        String temp = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        
        return temp;
    }
}
