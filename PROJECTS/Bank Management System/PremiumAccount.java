class PremiumAccount extends RegularAccount {
    public PremiumAccount(String name, double initialDeposit) {
        super(name, initialDeposit);
    }

    public void withdraw(double amount) throws Exception {
        if (getBalance() - amount < 0) {
            throw new Exception("Insufficient balance!");
        } else {
            setBalance(getBalance() - amount);
            System.out.println("[Premium] Withdrawal successful. New Balance: ₹" + getBalance());
            if (getBalance() < MIN_BALANCE) {
                System.out.println("Warning: Balance below minimum.");
            }
        }
    }

    public double getBonus() {
        return 0.02 * getBalance();
    }
}