import java.util.Scanner;

public class BankAccount {
   private double deposits;
   private double withdrawals;
   private double transfers;
   private double balance;
   private double total;
   public double resetBalance;
   public double amount;
   String error = "\u001B[41m";
   String resetColor = "\u001B[0m";

   Scanner input = new Scanner(System.in);

   public double getDeposits() {
      boolean validInput = false;

      while (!validInput) {
         System.out.print("Enter the amount to deposit: $");

         if (input.hasNextDouble()) {
            this.amount = input.nextDouble();
            this.deposits += this.amount;
            validInput = true;
         } else {
            input.next();
            System.out.println(error + "Invalid input. Please enter a valid amount"+ resetColor);
         }
      }
      return this.deposits;
   }

   public double getWithdrawals() {
      boolean validInput = false;

      while (!validInput) {
         System.out.print("Enter the amount to withdraw: $");

         if (input.hasNextDouble()) {
            this.amount = input.nextDouble();
            this.withdrawals += this.amount;
            validInput = true;
         } else {
            input.next();
            System.out.println(error + "Invalid input. Please enter a valid amount"+ resetColor);
         }
      }
      return this.withdrawals;
   }

   public double getTransfers() {
      boolean validInput = false;

      while (!validInput) {
         System.out.print("Enter the amount to transfer: $");

         if (input.hasNextDouble()) {
            this.amount = input.nextDouble();
            this.transfers += this.amount;
            validInput = true;
         } else {
            input.next();
            System.out.println(error + "Invalid input. Please enter a valid amount"+ resetColor);
         }
      }
      return this.transfers;
   }

   public double getBalance() {
      this.balance = this.deposits - (this.withdrawals + this.transfers);
      return this.balance;
   }

   public double getTotal() {
      total = (this.total + this.deposits) - (this.withdrawals + this.transfers);
      return this.total;
   }

   public double resetBalance() {
      this.balance = 0.00;
      this.total = 0.00;
      this.transfers = 0.00;
      this.withdrawals = 0.00;
      this.deposits = 0.00;
      return this.resetBalance;
   }
}
