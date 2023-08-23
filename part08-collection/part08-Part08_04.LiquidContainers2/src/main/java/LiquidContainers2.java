
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container contain1 = new Container();
        Container contain2 = new Container();

        while (true) {
            System.out.println("First: " + contain1 + "\nSecond: " + contain2);

            String command = scan.nextLine();
            if (command.equals("quit")) {
                break;
            }
            
            String [] split = command.split(" ");
            int num = Integer.valueOf(split[1]);
            
            if(split[0].equals("add")){
                contain1.add(num);
            } else if(split[0].equals("move")){
                if(contain1.contains() == 0 || num <= 0){
                    continue;
                } else if(num > contain1.contains()){
                    contain2.add(contain1.contains());
                    contain1.remove(num);           
                } else if(num <= contain1.contains()){
                    contain1.remove(num);
                    contain2.add(num);
                }
            } else if(split[0].equals("remove")){
                contain2.remove(num);
            }
        }
    }

}
