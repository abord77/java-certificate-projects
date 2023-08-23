
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            
            if(books.contains(new Book(name, publicationYear))){
                continue;
            } else{
                books.add(new Book(name, publicationYear));
            }
            /*
            if (books.size() == 0) {
                Book book = new Book(name, publicationYear);
                books.add(book);
                continue;
            } else {
                for (int i = 0; i < books.size(); i++) {
                    Book book = new Book(name, publicationYear);
                    if (books.get(i).equals(book)) {
                        System.out.println("The book is already on the list. Let's not add the same book again.");
                        break;
                    } else {
                        if(i == books.size() - 1){
                            books.add(book);
                        }
                    }
                }
            }*/
        }

        // NB! Don't alter the line below!
        System.out.println("Thank you! Books added: " + books.size());
    }
}
