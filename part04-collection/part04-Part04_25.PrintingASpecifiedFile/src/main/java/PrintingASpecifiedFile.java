
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Which file should have its contents printed?");
        String fileName = sc.nextLine();
        
        try(Scanner scanner = new Scanner(Paths.get(fileName))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
