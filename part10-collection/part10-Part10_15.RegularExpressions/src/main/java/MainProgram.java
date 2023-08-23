

public class MainProgram {

    public static void main(String[] args) {
        Checker test = new Checker();
        System.out.println(test.timeOfDay("3:59:31"));
        System.out.println(test.timeOfDay("24:59:59"));
    }
}
