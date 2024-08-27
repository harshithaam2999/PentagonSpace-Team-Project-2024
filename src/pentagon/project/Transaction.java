package pentagon.project;

import java.util.ArrayList;
import java.util.List;

public class Transaction 
{
    private static List<String[]> transactionHistory = new ArrayList<>();

    public static void deposit(Account account, double amount) 
    {
        account.setBalance(account.getBalance() + amount);
        String[] transactionDetails = {"Deposit", account.getAccountNumber(), String.valueOf(amount)};
        transactionHistory.add(transactionDetails);
        System.out.println("Deposited " + amount + " into account " + account.getAccountNumber());
    }

    public static void withdraw(Account account, double amount)
    {
        if (account.getBalance() >= amount) 
        {
            account.setBalance(account.getBalance() - amount);
            String[] transactionDetails = {"Withdraw", account.getAccountNumber(), String.valueOf(amount)};
            transactionHistory.add(transactionDetails);
            System.out.println("Withdrew " + amount + " from account " + account.getAccountNumber());
        } 
        else 
        {
            System.out.println("Insufficient funds.");
        }
    }

    public static void transfer(Account sender, Account receiver, double amount)
    {
        if (sender.getBalance() >= amount)
        {
            sender.setBalance(sender.getBalance() - amount);
            receiver.setBalance(receiver.getBalance() + amount);
            String[] transactionDetails = {"Transfer", sender.getAccountNumber(), receiver.getAccountNumber(), String.valueOf(amount)};
            transactionHistory.add(transactionDetails);
            System.out.println("Transferred " + amount + " from account " + sender.getAccountNumber() + " to account " + receiver.getAccountNumber());
        }
        else 
        {
            System.out.println("Insufficient funds in account " + sender.getAccountNumber());
        }
    }

    public static void displayTransactionHistory()
    {
        System.out.println("\nTransaction History:");
        System.out.println("----------------------------------------------------");
        System.out.printf("%-15s %-20s %-20s %-10s\n", "Type", "Account Number", "Receiver Account", "Amount");
        System.out.println("----------------------------------------------------");
        for (String[] transaction : transactionHistory)
        {
            if (transaction[0].equals("Transfer"))
            {
                System.out.printf("%-15s %-20s %-20s %-10s\n", transaction[0], transaction[1], transaction[2], transaction[3]);
            }
            else
            {
                System.out.printf("%-15s %-20s %-20s %-10s\n", transaction[0], transaction[1], "-", transaction[2]);
            }
        }
        System.out.println("----------------------------------------------------");
    }
}
