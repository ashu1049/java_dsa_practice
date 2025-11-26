// Q1. Create a BankAccount class
// •	Fields: accountNumber, holderName, balance
// •	Methods: deposit(), withdraw(), showDetails()
// •	Create two accounts and perform operations.

class BankAccount{
    int accountNumber;
    String holdername;
    int balance;

    BankAccount(int accountNumber, String holdername, int balance)
    {
        this.accountNumber=accountNumber;
        this.holdername=holdername;
        this.balance=balance;
    }

    void deposit(int amount)
    {
        balance+=amount;
        System.out.println("money deposited in account "+accountNumber);
    }
    void withdraw(int amount)
    {
        if(balance>=amount)
        {
            balance-=amount;
            System.out.println("money withdrawn from account "+accountNumber);
        }
        else
        {
            System.out.println("Not enough money.");
        }
    }
    void showdetails()
    {
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Holdername: "+holdername);
        System.out.println("Balance: "+balance);
        System.out.println();
    }

    public static void main(String[] args) {
        
        BankAccount b1= new BankAccount(123, "Ashutosh", 10000);
        BankAccount b2= new BankAccount(456, "Rahul", 20000);

        b1.deposit(10000);
        b1.withdraw(5000);
        b1.showdetails();

        b2.deposit(0);
        b2.withdraw(25000);
        b2.showdetails();
    }

}