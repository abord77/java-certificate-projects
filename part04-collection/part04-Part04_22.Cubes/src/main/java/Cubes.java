
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String str = scanner.nextLine();
            if(str.equals("end")){
                break;
            }
            System.out.println((int)Math.pow(Integer.valueOf(str), 3));
        }
    }
}
