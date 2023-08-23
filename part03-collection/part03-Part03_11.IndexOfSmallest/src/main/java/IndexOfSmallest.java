
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> numLst = new ArrayList<>();
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if(num == 9999){
                break;
            }
            numLst.add(num);
        }
        
        int smallest = 10000;
        for(int i = 0; i < numLst.size(); i++){
            if(numLst.get(i) < smallest){
                smallest = numLst.get(i);
            }
        }
        System.out.println("Smallest number: " + smallest);
        for(int i = 0; i < numLst.size(); i++){
            if(numLst.get(i) == smallest){
                System.out.println("Found at index: " + i);
            }
        }

        
    }
}
