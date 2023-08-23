
import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        
        while(true){
            System.out.println("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            
            if(name.isEmpty()){
                break;
            }
            
            System.out.println("Input the age recommendation: ");
            int minAge = Integer.valueOf(scanner.nextLine());
            books.add(new Book(name, minAge));
        }
        
        Comparator<Book> comparator = Comparator
              .comparing(Book::getMinAge)
              .thenComparing(Book::getName);
        
        Collections.sort(books, comparator);
        System.out.println(books.size() + " books in total.");
        System.out.println("\nBooks:");
        for(Book print : books){
            System.out.println(print);
        }
    }

}
