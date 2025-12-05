// Q13. Build a simple ATM menu
// Options:
// 1.	Check balance
// 2.	Deposit
// 3.	Withdraw
// 4.	Exit

import java.util.Scanner;

public class atm13
{

    Scanner sc = new Scanner(System.in);
    int balance=0;//we are starting with 0 balance.
    int amount;

    void options()
    {
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

        System.out.print("Enter your chice to perform operation:");
        int choice= sc.nextInt();

        
        if(choice==1)
        {
            viewbalance();
        }
        else if (choice==2)
        {
            System.out.print("Enter the amount you want to deposit: ");
            amount= sc.nextInt();
            deposit(amount);
        }
        else if (choice==3)
        {
            System.out.print("Enter the amount you want to Withdraw: ");
            amount= sc.nextInt();
            withdraw(amount);
        }
        else if (choice==4)
        {    
           exit();
        }
        else
        {
            System.out.println("WRONG CHIOCE, ENTER CORRECT OPTION FROM 1 TO 4.");
            options();
        }   
        
    }

    void viewbalance()
    {
        System.out.println("Your Current Balance is: "+ balance);
        System.out.println();
        options();
    }

    void deposit(int amount)
    {
        balance+=amount;
        System.out.println("Amount deposited Successfully.");
        System.out.println();
        options();
    }

    void withdraw(int amount)
    {
        if(amount>balance)
        {
            System.out.println("Balance is not enough to withdraw.");
        }
        else
        {
            balance-=amount;
            System.out.println("Amount withrawn Succefully.");
        }
        System.out.println();
        options();
    }

    void exit()
    {
        System.out.println();
        System.out.println("Exited, Thank you.");
    }
    public static void main(String[] args)
    {
        atm13 a = new atm13();
        a.options();
    }  
}