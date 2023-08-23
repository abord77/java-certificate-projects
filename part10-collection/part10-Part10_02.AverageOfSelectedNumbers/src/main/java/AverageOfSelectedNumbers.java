
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();


        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }

            inputs.add(row);
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String whichType = scanner.nextLine();
        if(whichType.equals("p")){
            double avg = inputs.stream()
                    .mapToInt(x -> Integer.valueOf(x))
                    .filter(x -> x > 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers: " + avg);
        } else{
            double avg = inputs.stream()
                    .mapToInt(x -> Integer.valueOf(x))
                    .filter(x -> x < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: " + avg);
        }
    }
}
