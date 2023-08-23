
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String a = scanner.nextLine();
            if(a.equals("end")){
                break;
            }
            
            System.out.println((int)Math.pow(Integer.valueOf(a), 3));
        }
    }
}
