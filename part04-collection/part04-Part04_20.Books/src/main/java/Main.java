import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if(title.isEmpty()){
                break;
            }
            
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int pubYear = Integer.valueOf(scanner.nextLine());
            books.add(new Book(title, pages, pubYear));
        }
        
        System.out.println("What information will be printed?");
        String whatToPrint = scanner.nextLine();
        
        if(whatToPrint.equals("everything")){
            for(int i = 0; i < books.size(); i++){
                System.out.println(books.get(i).everything());
            }
        } else if(whatToPrint.equals("name")){
            for(int i = 0; i < books.size(); i++){
                System.out.println(books.get(i).name());
            }
        }
    }
}
