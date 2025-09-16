class interface BankInterface{
    Declares the bank operations:

     createAccount()
     deposit()
     withdraw()
    displayDetails()
}

 abstract class User{
     Stores private instance variables: accountHolderName, accountNumber, and balance.
     Constructor initializes these values and auto-generates account numbers.
}
class RegularAccount{
    Implements all methods from BankInterface. 
   Enforces a minimum balance of ₹1000.
    Performs deposit and withdrawal operations with error checks.
     Implements displayDetails() to show user information.
}

class PremiumAccount{
    Overrides withdraw() to allow withdrawal beyond minimum balance (even negative balance allowed).
    Displays warnings if balance goes below minimum.
    Contains method getBonus() to calculate 2% of current balance as a reward
}

class TransactionUtils{
    Static method printSeparator() 
}

Static method printSeparator() {
    Creating new user accounts (Regular/Premium)
    Performing deposits, withdrawals
    Checking account balances

}
class BankAppMain{
    Entry point of the program.

Displays a welcome message and starts the menu-driven user interface through BankManager.handleUserInput().
}