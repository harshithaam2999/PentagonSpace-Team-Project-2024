package pentagon.project;

import java.util.Scanner;

public class BankingApplication 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        
        while (true) 
        {
            System.out.println("*****BANKING APPLICATION Menu*****");
            System.out.println();
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Grant Loan");
            System.out.println("6. Calculate Loan Interest");
            System.out.println("7. Repay Loan");
            System.out.println("8. Check Account Balance");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("Enter account holder name: ");
                    String accountHolderName = scanner.nextLine();
                    System.out.print("Enter initial balance: ");
                    double initialBalance = scanner.nextDouble();
                    bank.createAccount(accountNumber, accountHolderName, initialBalance);
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    Transaction.deposit(bank.getAccount(accountNumber), depositAmount);
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    Transaction.withdraw(bank.getAccount(accountNumber), withdrawAmount);
                    break;
                case 4:
                    System.out.print("Enter sender account number: ");
                    String fromAccount = scanner.nextLine();
                    System.out.print("Enter receiver account number: ");
                    String toAccount = scanner.nextLine();
                    System.out.print("Enter amount to transfer: ");
                    double transferAmount = scanner.nextDouble();
                    Transaction.transfer(bank.getAccount(fromAccount), bank.getAccount(toAccount), transferAmount);
                    break;
                case 5:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextLine();
                    System.out.println("Enter the loan type which you want to take : ");
                    System.out.println("1. Educational Loan\n 2. Personal Loan\n 3. Vehical Loan\n 4. Gold Loan\n");
                    int ch=scanner.nextInt();
                    if(ch==1)
                    {
                    	System.out.print("Enter loan amount: ");
                        double loanAmount = scanner.nextDouble();
                        System.out.print("The interest rate for Educational loan is 6.5% ");
                        double interestRate = 6.5;
                        bank.grantLoan(accountNumber, loanAmount, interestRate);
                    }
                    else if(ch==2)
                    {
                    	System.out.print("Enter loan amount: ");
                        double loanAmount = scanner.nextDouble();
                        System.out.print("The interest rate for Personal loan is 9.5% ");
                        double interestRate = 9.5;
                        bank.grantLoan(accountNumber, loanAmount, interestRate);
                    }
                    else if(ch==3)
                    {
                    	System.out.print("Enter loan amount: ");
                        double loanAmount = scanner.nextDouble();
                        System.out.print("The interest rate for Vehical loan is 11.25% ");
                        double interestRate = 11.25;
                        bank.grantLoan(accountNumber, loanAmount, interestRate);
                    }
                    else
                    {
                    	System.out.print("Enter loan amount: ");
                        double loanAmount = scanner.nextDouble();
                        System.out.print("The interest rate for Gold loan is 8.75% ");
                        double interestRate = 8.75;
                        bank.grantLoan(accountNumber, loanAmount, interestRate);
                    }
                    
                    break;
                case 6:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextLine();
                    bank.calculateLoanInterest(accountNumber);
                    break;
                case 7:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("Enter amount to repay: ");
                    double repayAmount = scanner.nextDouble();
                    bank.repayLoan(accountNumber, repayAmount);
                    break;
                case 8:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextLine();
                    Account account = bank.getAccount(accountNumber);
                    if (account != null) {
                        System.out.println("Account Balance: $" + account.getBalance());
                        System.out.println("Loan Amount: $" + account.getLoanAmount());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 9:
                    System.out.println("Exiting application. Thank you!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
                    