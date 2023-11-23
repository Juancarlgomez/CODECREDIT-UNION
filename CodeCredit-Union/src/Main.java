public class Main {
    public static void main(String[] args) {
   
       // Bank object
      Bank bank = new Bank("Mountain America Credit Union","753 S Jordan Pkwy, South Jordan, UT, 84095");
      System.out.println( bank.getBank_name() + "\n" + bank.getBank_address() + "\n");

      // Customer object
      Customer customer = new Customer("", "", 0); 
      customer.getFirst_name();
      customer.getLast_name();
      System.out.println("Account number: " + customer.getAccount_num());
   
      // Transaction object
      Transaction transaction = new Transaction("", "", 0);
      String type = transaction.getType();
      double subtract = 0;
      double add = 0;
      if (type ==  "Transfer" ) {
         transaction.getSender();
         subtract = transaction.getAmount();
      }

      else if (type ==  "Withdrawal" ) {
         subtract = transaction.getAmount();
      }

      else {
         add = transaction.getAmount();
      }
   
      // BankAccount object
      if (subtract != 0 && type == "Transfer") {
        BankAccount transfers = new BankAccount(0, 0, subtract, 1000); 
        System.out.printf("Transferred: $%.2f\n", transfers.getTransfers());
        System.out.printf("Total: $%.2f\n", transfers.getTotal());
      }
      else if (subtract != 0 && type == "Withdrawal") {
        BankAccount withdrawals = new BankAccount(0, subtract, 0, 1000);
        System.out.printf("Withdrew: $%.2f\n", withdrawals.getWithdrawals());
        System.out.printf("Total: $%.2f\n", withdrawals.getTotal());
      }
      else if (add!= 0 && type == "Deposit") {
        BankAccount deposits = new BankAccount(add, 0, 0, 1000);
        System.out.printf("Deposited: $%.2f\n", deposits.getDeposits());
         System.out.printf("Total: $%.2f\n", deposits.getTotal());
      }

      // No longer needed  you can delete this line
      //System.out.printf("deposits: $%.2f\n withdrawals: $%.2f\n transfers: $%.2f\n total: $%.2f\n", bankAccount.getDeposits(), bankAccount.getWithdrawals(), bankAccount.getTransfers(), bankAccount.getTotal());
      
    }
 }

