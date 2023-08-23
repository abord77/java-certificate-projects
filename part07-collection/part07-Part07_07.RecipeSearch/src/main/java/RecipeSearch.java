
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Recipe> recipes = new ArrayList<>();
        UserInterface output = new UserInterface(scanner, recipes);

        System.out.println("File to read: ");
        String file = scanner.nextLine();
        int x = 0;
        try ( Scanner sc = new Scanner(Paths.get(file))) {
            while (sc.hasNextLine()) {
                String name = sc.nextLine();
                int cookTime = Integer.valueOf(sc.nextLine());
                recipes.add(new Recipe(name, cookTime));

                while (true && sc.hasNextLine()) {
                    String ingredient = sc.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    } else {
                        recipes.get(x).add(ingredient);
                    }
                }
                x++;
            }
        } catch (Exception ex) {
            System.out.println("Reading the file " + file + " failed.\nError: " + ex);
        }

        output.start();
    }

}
