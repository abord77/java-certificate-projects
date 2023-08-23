
import java.util.Scanner;

public class AverageOfNumbers {

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
        System.out.println("Average of the numbers: " + (sumCount / (double) numCount));
    }
}
