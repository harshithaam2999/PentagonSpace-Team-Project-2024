package pentagon.project;

public class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private double loanAmount;
    private double loanInterestRate;

    public Account(String accountNumber, String accountHolderName, double initialBalance) 
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.loanAmount = 0;
        this.loanInterestRate = 0;
    }

   
    public String getAccountNumber() 
    {
        return accountNumber;
    }

    public String getAccountHolderName() 
    {
        return accountHolderName;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public double getLoanAmount()
    {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) 
    {
        this.loanAmount = loanAmount;
    }

    public double getLoanInterestRate()
    {
        return loanInterestRate;
    }

    public void setLoanInterestRate(double loanInterestRate) 
    {
        this.loanInterestRate = loanInterestRate;
    }
}