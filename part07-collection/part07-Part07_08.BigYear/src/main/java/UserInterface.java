
import java.util.ArrayList;
import java.util.Scanner;


public class UserInterface {
    private Scanner scanner;
    private ArrayList<Birds> birds;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.birds = new ArrayList<>();
    }
    
    public void start(){
        while (true) {
            System.out.println("?");
            String command = this.scanner.nextLine();
            
            if(command.equals("Quit")){
                break;
            } else if(command.equals("Add")){
                System.out.println("Name:");
                String name = this.scanner.nextLine();
                System.out.println("Name in latin:");
                String latinName = this.scanner.nextLine();
                this.birds.add(new Birds(name, latinName));
            } else if(command.equals("Observation")){
                int i = 0;
                System.out.println("Bird?");
                String bird = this.scanner.nextLine();
                for(Birds name : birds){
                    if(name.getName().equals(bird)){
                        name.observation();
                    } else if(i == birds.size() - 1){
                        System.out.println("Not a bird!");
                    }
                }
            } else if(command.equals("All")){
                for(Birds name : birds){
                    System.out.println(name);
                }
            } else if(command.equals("One")){
                System.out.println("Bird?");
                String bird = this.scanner.nextLine();
                for(Birds name : birds){
                    if(name.getName().equals(bird)){
                        System.out.println(name);
                    }
                }
            }
        }   
    }
}
