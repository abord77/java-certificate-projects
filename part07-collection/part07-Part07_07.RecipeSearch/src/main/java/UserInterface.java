
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private ArrayList<Recipe> recipes;

    public UserInterface(Scanner scanner, ArrayList<Recipe> recipes) {
        this.scanner = scanner;
        this.recipes = recipes;
    }

    public void start() {
        System.out.println("\nCommands:\n"
                + "list - lists the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.println("\nEnter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                System.out.println("\nRecipes:");
                for (Recipe print : this.recipes) {
                    System.out.println(print);
                }
            } else if (command.equals("find name")) {
                System.out.println("Searched word:");
                String search = scanner.nextLine();
                System.out.println("\nRecipes:");
                for (Recipe print : this.recipes) {
                    if (print.getName().contains(search)) {
                        System.out.println(print);
                    }
                }
            } else if (command.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int time = Integer.valueOf(scanner.nextLine());
                System.out.println("\nRecipes:");
                for (Recipe print : this.recipes) {
                    if (print.getCookTime() <= time) {
                        System.out.println(print);
                    }
                }
            } else if (command.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String ingredient = scanner.nextLine();
                System.out.println("\nRecipes:");
                for (Recipe print : this.recipes) {
                    if (print.recipeContains(ingredient)) {
                        System.out.println(print);
                    }
                }
            }
        }
    }
}
