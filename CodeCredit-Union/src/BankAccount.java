public class BankAccount {
    private double deposits;
    private double withdrawals;
    private double transfers;
    private double total;

    public BankAccount(double deposits, double withdrawals, double transfers, double total) {
        this.deposits = deposits;
        this.withdrawals = withdrawals;
        this.transfers = transfers;
        this.total = total;
    }

    public double getDeposits() {
        return deposits;
    }

    public double getWithdrawals() {
        return withdrawals;
    }

    public double getTransfers() {
        return transfers;
    }

    public double getTotal() {
        total = (total + deposits) - (withdrawals + transfers);
        return total;
    }
}
