
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give points [0-100]:");
        int grade = Integer.valueOf(scanner.nextLine());
        
        if(grade < 0){
            System.out.println("impossible!");
        } else if(grade >= 0 && grade < 50){
            System.out.println("failed");
        } else if(grade >= 50 && grade < 60){
            System.out.println("1");
        } else if(grade >= 60 && grade < 70){
            System.out.println("2");
        } else if(grade >= 70 && grade < 80){
            System.out.println("3");
        } else if(grade >= 80 && grade < 90){
            System.out.println("4");
        } else if(grade >= 90 && grade <= 100){
            System.out.println("5");
        } else{
            System.out.println("incredible!");
        }
    }
}
