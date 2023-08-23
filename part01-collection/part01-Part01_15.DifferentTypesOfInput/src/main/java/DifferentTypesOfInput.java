
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string:");
        String a = scanner.nextLine();
        System.out.println("Give an integer:");
        int b = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double c = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean d = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("You gave the string " + a);
        System.out.println("You gave the integer " + b);
        System.out.println("You gave the double " + c);
        System.out.println("You gave the boolean " + d);
       
    }
}
