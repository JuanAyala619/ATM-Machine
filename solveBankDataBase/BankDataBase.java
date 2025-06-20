import java.util.ArrayList;

public class BankDataBase{
    private ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account account){
        accounts.add(account);
    }

    public void removeAccount(int position){
        accounts.remove(position);
    }

    public Account findByAccountNumber(int accountNumber){
        return accounts.stream()
        .filter(acc -> acc.getAccountNumber() == accountnumber)
        .findFirst().orElse(null);
    }

    private Account getAccountByPin(int pin){
        return accounts.stream()
        .filter(acc -> acc.getPin() == pin)
        .findFirst().orElse(null);
    }

    public double getAvailableBalance(int accountNumber){
        return accounts.stream()
        .filter(acc -> acc.getAccountNumber() == accountNumber)
        .findFirst().orElse(null)
        .getAvailableBalance();
    }

    public double getTotalBalance(int accountNumber){
        return accounts.stream()
        .filter(acc -> acc.getAccountNumber() == accountNumber)
        .findFirst().orElse(null)
        .getTotalBalance();  
    }

    public void credit(int accountNumber, int amount){
        accounts.stream()
        .filter(acc -> acc.getAccountNumber() == accountNumber)
        .findFirst().orElse(null)
        .credit(amount);
    }

    public void debit(int accountNumber, int amount){
        accounts.stream()
        .filter(acc -> acc.getAccountNumber() == accountNumber)
        .findFirst().orElse(null)
        .debit(amount);
    }

    public ArrayList<Account> getAllAccount(){
        return accounts;
    }
}

