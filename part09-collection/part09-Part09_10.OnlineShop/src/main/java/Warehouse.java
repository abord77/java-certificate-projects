
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Warehouse {
    private Map<String, Integer> productInfo;
    private Map<String, Integer> productAmount;
    
    public Warehouse(){
        this.productInfo = new HashMap<>();
        this.productAmount = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        this.productInfo.putIfAbsent(product, price);
        this.productAmount.putIfAbsent(product, stock);
    }
    
    public int price(String product){
        return this.productInfo.getOrDefault(product, -99);
    }
    
    public int stock(String product){
        return this.productAmount.getOrDefault(product, 0);
    }
    
    public boolean take(String product){
        if(this.productAmount.getOrDefault(product, 0) == 0){
            return false;
        }
        
        if(this.productAmount.get(product) > 0){
            this.productAmount.put(product, this.productAmount.get(product) - 1);
            return true;
        }
        
        return false;
    }
    
    public Set<String> products(){
        return this.productInfo.keySet();
    }
}
