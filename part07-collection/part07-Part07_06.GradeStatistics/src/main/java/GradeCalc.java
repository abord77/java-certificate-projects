
import java.util.ArrayList;


public class GradeCalc {
    private ArrayList<Integer> grades;
    
    public GradeCalc(){
        this.grades = new ArrayList<>();
    }
    
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    
    public double averageAll(){
        int sum = 0;
        for(int i = 0; i < this.grades.size(); i++){
            sum += this.grades.get(i);
        }
        
        return sum / (double) this.grades.size();
    }
    
    public double averagePassing(){
        int sum = 0;
        int passingCount = 0;
        for(int i = 0; i < this.grades.size(); i++){
            if(this.grades.get(i) >= 50){
                sum += this.grades.get(i);
                passingCount++;
            }
        }
        
        return sum / (double) passingCount;
    }
    
    public double passingPercent(){
        int passingCount = 0;
        for(int i = 0; i < this.grades.size(); i++){
            if(this.grades.get(i) >= 50){
                passingCount++;
            }
        }
        
        return (passingCount / (double) this.grades.size()) * 100;
    }
    
    public void gradeDistribution(){
        int [] gradeAmount = new int[6];
        for(int i = 0; i < this.grades.size(); i++){
            if(this.grades.get(i) < 50){
                gradeAmount[0]++;
            } else if(this.grades.get(i) < 60){
                gradeAmount[1]++;
            } else if(this.grades.get(i) < 70){
                gradeAmount[2]++;
            } else if(this.grades.get(i) < 80){
                gradeAmount[3]++;
            } else if(this.grades.get(i) < 90){
                gradeAmount[4]++;
            } else if(this.grades.get(i) <= 100){
                gradeAmount[5]++;
            }
        }
        System.out.println("Grade distribution: ");
        for(int i = 5; i >= 0; i--){
            System.out.print(i + ": ");
            for(int j = 0; j < gradeAmount[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
