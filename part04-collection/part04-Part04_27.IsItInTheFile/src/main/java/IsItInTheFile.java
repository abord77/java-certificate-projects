
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        try(Scanner sc = new Scanner(Paths.get(file))){
            int counter = 0;
            int i = 0;
            while(sc.hasNextLine()){
                lines.add(sc.nextLine());
                if(lines.get(i).contains(searchedFor)){
                    System.out.println("Found!");
                } else{
                    counter++;
                }
                i++;
            }
            if(counter == lines.size()){
                System.out.println("Not found.");
            }
        } catch (Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}
