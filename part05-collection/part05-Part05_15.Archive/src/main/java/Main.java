
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archive = new ArrayList<>();
        
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if(identifier.isEmpty()){
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            
            if (archive.size() == 0) {
                archive.add(new Archive(identifier, name));
                continue;
            } else {
                for (int i = 0; i < archive.size(); i++) {
                    Archive archives = new Archive(identifier, name);
                    if (archive.get(i).equals(archives)) {
                        break;
                    } else {
                        if(i == archive.size() - 1){
                            archive.add(archives);
                        }
                    }
                }
            }
        }
        
        for(int i = 0; i < archive.size(); i++){
            System.out.println(archive.get(i).getIdentifier() + ": " + archive.get(i).getName());
        }

    }
}
