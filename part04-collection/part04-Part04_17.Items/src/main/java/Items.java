
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name: ");
        String name = scanner.nextLine();
        
        while(!name.isEmpty()){
            items.add(new Item(name));
            System.out.println("Name: ");
            name = scanner.nextLine();
        }
        
        for(int i = 0; i < items.size(); i++){
            System.out.println(items.get(i));
        }
        

    }
}
