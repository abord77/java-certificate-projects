
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Name of the file: ");
        String file = scanner.nextLine();
        
        try(Scanner sc = new Scanner(Paths.get(file))){
            while(sc.hasNextLine()){
                String readData = sc.nextLine();
                String [] info = readData.split(",");
                
                if(Integer.valueOf(info[1]) == 1){
                    System.out.println(info[0] + ", age: " + info[1] + " year");
                } else{
                    System.out.println(info[0] + ", age: " + info[1] + " years");
                }
            }
        } catch (Exception ex){
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}
