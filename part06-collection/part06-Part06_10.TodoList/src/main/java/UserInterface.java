
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoList toDoList;

    public UserInterface(TodoList toDoList, Scanner scanner) {
        this.scanner = scanner;
        this.toDoList = toDoList;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                System.out.println("To add: ");
                String word = scanner.nextLine();
                this.toDoList.add(word);
                continue;
            }

            if (command.equals("list")) {
                this.toDoList.print();
                continue;
            }
            
            if(command.equals("remove")){
                System.out.println("Which one is removed?");
                int num = Integer.valueOf(scanner.nextLine());
                this.toDoList.remove(num);
            }
        }
    }
}
