import java.util.Scanner;

public class BankManager {
    static User[] users = new User[5];
    static Scanner sc = new Scanner(System.in);

    public static User getUserByAccountNumber(int accNo) {
        for (User u : users) {
            if (u != null && u.getAccountNumber() == accNo) {
                return u;
            }
        }
        return null;
    }

    public static void handleUserInput() {
        while (true) {
            TransactionUtils.printSeparator();
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        if (User.userCount >= 5) {
                            System.out.println("Max users reached.");
                            break;
                        }
                        System.out.print("Enter Name: ");
                        String name = sc.next();
                        System.out.print("Enter Initial Deposit: ");
                        double deposit = sc.nextDouble();
                        System.out.print("Type (1-Regular, 2-Premium): ");
                        int type = sc.nextInt();
                        if (type == 1)
                            users[User.userCount - 0] = new RegularAccount(name, deposit);
                        else
                            users[User.userCount - 0] = new PremiumAccount(name, deposit);
                        System.out.println("Account Created. Acc No: " + users[User.userCount - 1].getAccountNumber());
                        break;
                    case 2:
                        System.out.print("Enter Account Number: ");
                        int accNo = sc.nextInt();
                        User u = getUserByAccountNumber(accNo);
                        if (u == null) {
                            System.out.println("Invalid Account");
                            break;
                        }
                        System.out.print("Enter Amount to Deposit: ");
                        double amt = sc.nextDouble();
                        ((BankInterface) u).deposit(amt);
                        break;
                    case 3:
                        System.out.print("Enter Account Number: ");
                        int accW = sc.nextInt();
                        User uW = getUserByAccountNumber(accW);
                        if (uW == null) {
                            System.out.println("Invalid Account");
                            break;
                        }
                        System.out.print("Enter Amount to Withdraw: ");
                        double withAmt = sc.nextDouble();
                        ((BankInterface) uW).withdraw(withAmt);
                        break;
                    case 4:
                        System.out.print("Enter Account Number: ");
                        int accD = sc.nextInt();
                        User uD = getUserByAccountNumber(accD);
                        if (uD == null) {
                            System.out.println("Invalid Account");
                            break;
                        }
                        uD.displayDetails();
                        break;
                    case 5:
                        System.out.println("Thank you for banking with us!");
                        return;
                    default:
                        System.out.println("Invalid option");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Transaction completed.");
            }
        }
    }
}
