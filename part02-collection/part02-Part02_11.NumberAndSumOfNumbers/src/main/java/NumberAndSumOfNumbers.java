
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numCount = 0;
        int sumCount = 0;
        
        while(true){
            System.out.println("Give a number:");
            int a = Integer.valueOf(scanner.nextLine());
            
            if(a == 0){
                break;
            } else {
                sumCount += a;
                numCount++;
            }
        }
        System.out.println("Number of numbers: " + numCount);
        System.out.println("Sum of the numbers: " + sumCount);
    }
}
