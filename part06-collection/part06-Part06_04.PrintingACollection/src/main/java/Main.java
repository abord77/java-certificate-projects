
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        /*
        // Try out your class here
        SimpleCollection j = new SimpleCollection("characters");
        System.out.println(j);        
        
        System.out.println();
        
        j.add("magneto");
        System.out.println(j);
        
        System.out.println();
        
        j.add("mystique");
        System.out.println(j);
        
        System.out.println();
        
        j.add("phoenix");
        System.out.println(j);*/
        SimpleCollection c = new SimpleCollection("collection");
        c.add("element");
        c.add("aaaaa");
        c.add("BBBB");
        System.out.println(c);
        
        ArrayList<String> test = new ArrayList<>();
        test.add("aaaaaaaa");
        test.add("bbbbbbbb");
        test.add("ccccccc");
        
        for(String tmp : test){
            System.out.print(tmp + "\n");
        }

    }
}
