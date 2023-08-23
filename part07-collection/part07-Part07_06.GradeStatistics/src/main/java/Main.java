
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeCalc grades = new GradeCalc();
        
        System.out.println("Enter point totals, -1 stops: ");
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            
            if(num == -1){
                break;
            }
            
            if(num >= 0 && num <= 100){
                grades.addGrade(num);
            }
        }
        System.out.println("Point average (all): " + grades.averageAll());
        System.out.println("Point average (passing): " + grades.averagePassing());
        System.out.println("Pass percentage: " + grades.passingPercent());
        grades.gradeDistribution();
    }
}
