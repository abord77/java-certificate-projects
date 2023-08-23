
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        while(!(str.equals(""))){
            String [] split = str.split(" ");
            System.out.println(split[0]);
            str = scanner.nextLine();
        }
    }
}
