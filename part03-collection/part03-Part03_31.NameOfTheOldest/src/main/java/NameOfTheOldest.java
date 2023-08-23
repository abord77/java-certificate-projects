
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = 0;
        String longest = "";
        String str = scanner.nextLine();
        
        while(!(str.equals(""))){
            String [] split = str.split(",");
            if(Integer.valueOf(split[1]) > oldest){
                oldest = Integer.valueOf(split[1]);
                longest = split[0];
            }
            str = scanner.nextLine();
        }
        
        System.out.println("Name of the oldest: " + longest);

    }
}
