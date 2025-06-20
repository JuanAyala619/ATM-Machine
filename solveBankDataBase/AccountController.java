public class AccountController {
    private AccountService service;

    public AccountController(AccountService service) {
        this.service = service;
    }

    public void handleCreateUser() {
        String name = Screen.Inputfield1.getText();
        int accountnumber = Integer.parseInt(Screen.Inputfield2.getText());
        int pin = Integer.parseInt(Screen.Inputfield4.getText());
        double balance = Double.parseDouble(Screen.Inputfield3.getText());

        service.createAccount(name, accountnumber, pin, balance);

        Screen.Inputfield1.setText("");
        Screen.Inputfield2.setText("");
        Screen.Inputfield3.setText("");
        Screen.Inputfield4.setText("");
    }
}
