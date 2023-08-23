
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String a = scanner.nextLine();
        System.out.println("What is their job?");
        String b = scanner.nextLine();
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was " + a + ", who was " + b + ".\nOn the way to work, " + a + " reflected on life.");
        System.out.println("Perhaps " + a + " will not be " + b + " forever.");

        
    }
}
