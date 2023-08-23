
import java.util.ArrayList;
import java.util.Scanner;

public class PrintInRange {
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        for(int num : numbers){
            if(num >= lowerLimit && num <= upperLimit){
                System.out.println(num);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
    }
    
}
