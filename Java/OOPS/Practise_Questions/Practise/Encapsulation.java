// package OOPS.Practise_Questions.Practise;

/*
Question: Create a class Account with private properties accountNumber, balance, and ownerName. Provide public getter and setter methods for these properties. Implement a method deposit() to add money to the account and withdraw() to subtract money from the account, ensuring the balance doesn't go negative.
    Focus: Encapsulation and data hiding.
*/
class Account {
    // Private Properties
    private long AcNumber, Balance;
    private String Name;

    // Constructors
    Account() {
        AcNumber = 000000000000000L;
        Balance = 0L;
    }

    Account(long AcNumber, long Balance, String Name) {
        this.AcNumber = AcNumber;
        this.Balance = Balance;
        this.Name = Name;
    }

    // Setter
    public void setAcNumber(long acNumber) {
        AcNumber = acNumber;
    }

    public void setBalance(long balance) {
        Balance = balance;
    }

    public void setName(String name) {
        Name = name;
    }

    // Getter
    public String getName() {
        return Name;
    }

    public long getAcNumber() {
        return AcNumber;
    }

    public long getBalance() {
        return Balance;
    }

    // Deposite Function;
    public void Deposite(long Amount) {
        setBalance(Balance + Amount);
    }

    // Withdraw
    public void Withdraw(int Amount) {

        if ((Balance - Amount) > 0) {
            setBalance(Balance - Amount);
            System.out.println("Succesfully Wtihdraw of Amount " + Amount + "\nNew Balance is: " + getBalance());
        } else {
            System.out.println("Insuficent Balance!");
        }
    }

    @Override
    public String toString() {
        return "Account No: " + getAcNumber() + "\nAccount Holder: " + getName() + "\nBalance: " + getBalance();
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // Creating Object of Acount Class
        Account Ac1 = new Account(12345678987654L, 0L, "Sanjib Kumar Sah");
        Ac1.Deposite(12000L);
        Ac1.Deposite(10000L);
        System.out.println("\nBalance Before WithDraw: " + Ac1.getBalance() + "\n\n");
        Ac1.Withdraw(5000);
        Ac1.Withdraw(50000);

        System.out.println(Ac1);

    }
}
