
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        
        while (true) {
            System.out.println("First: " + first + "/100\nSecond: " + second + "/100");

            String command = scan.nextLine();
            if (command.equals("quit")) {
                break;
            }
            
            String [] split = command.split(" ");
            int num = Integer.valueOf(split[1]);
            
            if(split[0].equals("add")){
                if(num <= 0){
                    continue;
                } else if(num + first >= 100){
                    first = 100;
                } else{
                    first += num;
                }
            } else if(split[0].equals("move")){
                if(first == 0 || num <= 0){
                    continue;
                } else if(num > first){
                    if(second + num > 100){
                        second = 100;
                    } else{
                        second += first;
                    } 
                    first = 0;
                } else if(num <= first){
                    first -= num;
                    if(second + num > 100){
                        second = 100;
                    } else{
                        second += num;
                    }
                }
            } else if(split[0].equals("remove")){
                if(num <= 0){
                    continue;
                } else if(second - num <= 0){
                    second = 0;
                } else{
                    second -= num;
                }
            }
        }
    }

}
