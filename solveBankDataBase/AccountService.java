
public class AccountService{
    private BankDataBase db;

    public AccountService(BankDataBase db){
        this.db = db;
        db.addAccount(new Account("Customer1", 12345, 11111, 1000.0, 1200.0, 0));
        db.addAccount(new Account("Customer2", 98765, 22222, 200.0, 200.0, 0));
        db.addAccount(new Account("Customer3", 19234, 33333, 200.0, 200.0, 0));
        db.addAccount(new Account("Manager1", 99999, 00000, 0, 0, 1));
    }

    public boolean authenticateUser(int pin){
        return db.getAllAccounts().stream()
        .anyMatch(acc -> acc.GetPin() == pin && acc.validatePIN(pin));
    }

    public void createAccount(String name, int accNum, int pin, double balance){
        db.addAccount(new Account(name, accNum, pin, balance, balance, 0));
    }
}