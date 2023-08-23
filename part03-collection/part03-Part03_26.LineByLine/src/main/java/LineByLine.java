
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        while(!(str.equals(""))){
            String [] split = str.split(" ");
            for(String word : split){
                System.out.println(word);
            }
            str = scanner.nextLine();
        }
    }
}
