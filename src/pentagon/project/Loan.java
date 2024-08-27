package pentagon.project;

public class Loan {
    private double loanAmount;
    private double interestRate;

    public Loan(double loanAmount, double interestRate) {
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return loanAmount * (interestRate / 100);
    }
}