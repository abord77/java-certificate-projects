
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numCount = 0;
        int sumCount = 0;
        int posNum = 0;
        
        while(true){
            int a = Integer.valueOf(scanner.nextLine());
            
            if(a == 0){
                break;
            } else if(a > 0){
                sumCount += a;
                numCount++;
                posNum++;
            } else{
                continue;
            }
        }
        
        if(posNum == 0){
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(sumCount / (double) numCount);
        }
    }
}
