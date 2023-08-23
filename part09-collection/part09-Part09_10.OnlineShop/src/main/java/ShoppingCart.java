
import java.util.HashMap;
import java.util.Map;


public class ShoppingCart {
    private Map<String, Item> cart;
    
    public ShoppingCart(){
        this.cart = new HashMap<>();
    }
    
    public void add(String product, int price){
        if(this.cart.containsKey(product)){
            this.cart.get(product).increaseQuantity();
        }
        
        this.cart.putIfAbsent(product, new Item(product, 1, price));
    }
    
    public int price(){
        int cost = 0;
        for(Item prices : cart.values()){
            cost += prices.price();
        }
        
        return cost;
    }
    
    public void print(){
        for(Item printing : cart.values()){
            System.out.println(printing);
        }
    }
}
