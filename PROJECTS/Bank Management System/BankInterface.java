public interface BankInterface {
    void createAccount(String name, double initialDeposit);
    void deposit(double amount);
    void withdraw(double amount) throws Exception;
    void displayDetails();
}
