
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String str = scanner.nextLine();
        while(!(str.equals(""))){
            String [] split = str.split(" ");
            for(String word : split){
                if(word.contains("av")){
                    System.out.println(word);
                }
            }
            str = scanner.nextLine();
        }

    }
}
