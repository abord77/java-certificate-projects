
public class Book {
    private String title;
    private int pages;
    private int pubYear;
    
    public Book(String title, int pages, int pubYear){
        this.title = title;
        this.pages = pages;
        this.pubYear = pubYear;
    }
    
    public String everything(){
        return this.title + ", " + this.pages + " pages, " + this.pubYear;
    }
    
    public String name(){
        return this.title;
    }
}
