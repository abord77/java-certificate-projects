
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account account1 = new Account("Matthews account", 1000.00);
        Account account2 = new Account("My account", 0.00);
        
        account1.withdrawal(100.00);
        account2.deposit(100.00);
        
        System.out.println(account1);
        System.out.println(account2);
        
    }
}
