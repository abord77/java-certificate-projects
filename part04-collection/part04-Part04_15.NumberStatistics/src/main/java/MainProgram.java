
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Statistics obj1 = new Statistics();
        Statistics obj2 = new Statistics();
        Statistics obj3 = new Statistics();
        
        System.out.println("Enter numbers:");
        int num = Integer.valueOf(scanner.nextLine());
        
        while(num != -1){
            obj1.addNumber(num);
            if(num % 2 == 0){
                obj2.addNumber(num);
            } else{
                obj3.addNumber(num);
            }
            num = Integer.valueOf(scanner.nextLine());
        }
        
        System.out.println("Sum: " + obj1.sum());
        System.out.println("Sum of even numbers: " + obj2.sum());
        System.out.println("Sum of odd numbers: " + obj3.sum());
    }
}
