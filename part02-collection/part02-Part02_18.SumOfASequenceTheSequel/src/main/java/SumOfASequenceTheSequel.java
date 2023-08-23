
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        
        System.out.print("First number? ");
        int a = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int b = Integer.valueOf(scanner.nextLine());
        for(int i = a; i <= b; i++){
            sum += i;
        }
        
        System.out.println("The sum is " + sum);
    }
}
