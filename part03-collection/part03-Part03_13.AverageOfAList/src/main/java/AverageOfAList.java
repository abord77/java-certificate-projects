
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int sum = 0;
        ArrayList<Integer> numLst = new ArrayList<>();
        
        while(true){
            int a = Integer.valueOf(scanner.nextLine());
            if(a == -1){
                break;
            }
            numLst.add(a);
            num++;
        }
        
        for(int i : numLst){
            sum += i;
        }
        System.out.println("Average: " + (sum / (double) num));
        
    }
}
