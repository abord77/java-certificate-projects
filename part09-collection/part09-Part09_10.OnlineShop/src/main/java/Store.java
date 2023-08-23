
import java.util.Scanner;


public class Store {
    private Scanner scanner;
    private Warehouse warehouse;
    
    public Store(Warehouse warehouse, Scanner scanner){
        this.scanner = scanner;
        this.warehouse = warehouse;
    }

    // the method that handles the customers visit to the store.
    public void shop(String customer) {
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Welcome to the store " + customer);
        System.out.println("our selection:");

        for (String product : this.warehouse.products()) {
            System.out.println(product);
        }

        while (true) {
            System.out.println("What to put in the cart (press enter to go to the register): ");
            String product = scanner.nextLine();
            if (product.isEmpty()) {
                break;
            }
            
            if(this.warehouse.stock(product) == 0){
                continue;
            } else{
                this.warehouse.take(product);
                cart.add(product, this.warehouse.price(product));
            }
        }

        System.out.println("your shoppingcart contents:");
        cart.print();
        System.out.println("total: " + cart.price());
    }
}
