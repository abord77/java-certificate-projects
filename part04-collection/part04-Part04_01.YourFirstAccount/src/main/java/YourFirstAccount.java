
public class YourFirstAccount {

    public static void main(String[] args) {
        Account temp = new Account("Test", 100.00);
        System.out.println(temp);
        temp.deposit(20.00);
        System.out.println(temp);
    }
}
