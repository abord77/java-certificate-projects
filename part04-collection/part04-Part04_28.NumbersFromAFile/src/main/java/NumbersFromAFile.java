
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        try(Scanner sc = new Scanner(Paths.get(file))){
            while(sc.hasNextLine()){
                String num = sc.nextLine();
                if(Integer.valueOf(num) >= lowerBound && Integer.valueOf(num) <= upperBound){
                    counter++;
                }
            }
        } catch (Exception ex){
            System.out.println("Reading the file " + file + " failed.");
        }
        System.out.println("Numbers: " + counter);
    }

}
