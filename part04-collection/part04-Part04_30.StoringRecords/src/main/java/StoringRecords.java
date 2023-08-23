
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        try(Scanner sc = new Scanner(Paths.get(file))){
            while(sc.hasNextLine()){
                String readData = sc.nextLine();
                String [] info = readData.split(",");
                
                persons.add(new Person(info[0], Integer.valueOf(info[1])));
            }
        } catch (Exception ex){
            System.out.println("Reading the file " + file + " failed.");
        }
        return persons;

    }
}
