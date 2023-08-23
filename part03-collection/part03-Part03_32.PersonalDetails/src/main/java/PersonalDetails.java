
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int num = 0;
        String longest = "";
        String str = scanner.nextLine();
        
        while(!(str.equals(""))){
            String [] split = str.split(",");
            if(split[0].length() > longest.length()){
                longest = split[0];
            }
            sum += Integer.valueOf(split[1]);
            num++;
            str = scanner.nextLine();
        }
        
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + (sum / (double) num));
    }
}
