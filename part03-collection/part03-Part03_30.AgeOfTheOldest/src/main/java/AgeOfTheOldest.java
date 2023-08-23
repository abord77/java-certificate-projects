
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = 0;
        String str = scanner.nextLine();
        
        while(!(str.equals(""))){
            String [] split = str.split(",");
            if(Integer.valueOf(split[1]) > oldest){
                oldest = Integer.valueOf(split[1]);
            }
            str = scanner.nextLine();
        }
        
        System.out.println("Age of the oldest: " + oldest);
    }
}
