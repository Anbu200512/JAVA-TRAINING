abstract class User {
    private String accountHolderName;
    private int accountNumber;
    private double balance;
    static int userCount = 0;
    
    public User(String name, double balance) {
        this.accountHolderName = name;
        this.balance = balance;
        this.accountNumber = 1000 + ++userCount;
    }

    public String getAccountHolderName() { return accountHolderName; }
    public int getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }

    public void setBalance(double balance) { this.balance = balance; }

    abstract void displayDetails();
}