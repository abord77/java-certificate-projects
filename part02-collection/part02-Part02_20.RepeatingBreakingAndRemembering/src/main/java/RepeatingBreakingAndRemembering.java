
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {     
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give numbers:");
        int sum = 0;
        int numbers = 0;
        int even = 0, odd = 0;
        
        while(true){
            int a = Integer.valueOf(scanner.nextLine());
            
            if(a == -1){
                break;
            }
            
            sum += a;
            numbers++;
            if(a % 2 == 0){
                even++;
            } else {
                odd++;
            }
        }
        
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + (sum / (double) numbers));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
