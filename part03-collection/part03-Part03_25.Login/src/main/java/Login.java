
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter username: ");
        String a = scanner.nextLine();
        System.out.println("Enter password: ");
        String b = scanner.nextLine();
        
        if(a.equals("alex") && b.equals("sunshine")){
            System.out.println("You have successfully logged in!");
        } else if(a.equals("emma") && b.equals("haskell")){
            System.out.println("You have successfully logged in!");
        } else{
            System.out.println("Incorrect username or password!");
        }
    }
}
