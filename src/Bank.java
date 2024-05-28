class Account {
    protected String name = "Phongngu";
    protected String accountNumber = "12345";
    protected static int initialBalance;
    Account(){}
    Account (int money){
        if (checkBalance(money)) {
            initialBalance = money;
            mainNotification();
        }
        else System.out.println("Cannot open account!");
    }
    public static Boolean checkBalance (int money){
        return money >= 50000;
    }
    protected static void mainNotification (){

        System.out.println("Balance of main account: " + initialBalance + " VND");
    }
    protected void deposit (int money){
        initialBalance += money;
        mainNotification();
    }
    void withdraw (int money){
        if (checkBalance(initialBalance - money - 5000)) {
            initialBalance -= money+5000;
            mainNotification();
        }
        else System.out.println("Cannot withdraw!");
    }

}
class SavingAccount extends Account{
    private int savingBalance;
    private double interestRate = 0.1;
    SavingAccount(int money){
        if (checkBalance(money)){
            initialBalance -= money;
            savingBalance = money;
            savingNotification();
        }
        else System.out.println("Cannot open saving account!");
    }
    private void savingNotification(){
        System.out.println("Balance of saving account is: " + savingBalance + " VND");
        mainNotification();
    }
    @Override
    protected void deposit(int money) {
        if (checkBalance(initialBalance-money)) {
            initialBalance -= money;
            savingBalance += money;
            savingNotification();
        }
        else System.out.println("Cannot deposit saving account!");
    }
    void showInterestMoneyPerMonth(){
        System.out.println("Interest money per month is: " + (int)(savingBalance*interestRate/12) + " VND");
    }
}

public class Bank{
    public static void main(String[] args) {
        Account account1 = new Account(30000);
        Account account = new Account(50000);
        account.deposit(300000);
        account.withdraw(10000);
        account.withdraw(400000);
        SavingAccount savingAccount1 = new SavingAccount(49999);
        SavingAccount savingAccount2 = new SavingAccount(100000);
        savingAccount2.showInterestMoneyPerMonth();
        savingAccount2.deposit(300000);
        savingAccount2.deposit(50000);
        savingAccount2.showInterestMoneyPerMonth();
    }
}
