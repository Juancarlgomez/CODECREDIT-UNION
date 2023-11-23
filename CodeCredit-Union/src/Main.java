
public class Main {
   public static void main(String[] args) {

      // creates the boolean for looping
      boolean quit = false;

      // FABIAN MERGED START
      System.out.println(
                  " ______            __         ______                  __  __  __     _______         __               \r\n"+ //
                  "|      |.-----..--|  |.-----.|      |.----..-----..--|  ||__||  |_  |   |   |.-----.|__|.-----..-----.\r\n"+ //
                  "|   ---||  _  ||  _  ||  -__||   ---||   _||  -__||  _  ||  ||   _| |   |   ||     ||  ||  _  ||     |\r\n"+ //
                  "|______||_____||_____||_____||______||__|  |_____||_____||__||____| |_______||__|__||__||_____||__|__|\r\n"+ //
                  "                                                                                                      \r\n"+ //
                  "\n");
      // FABIAN MERGE END

      // Customer object
      Customer customer = new Customer();
      customer.getFirst_name();
      customer.getLast_name();
      // prints out only the last 4 digits of the account number
      System.out.println("Account number: ****" + customer.getAccount_num() % 10000);

      // BankAccount object
      BankAccount myAccount = new BankAccount();
      // loops the Transaction object,
      // removed the bankAccount object from the loop to prevent it from recreating
      // the same object while in the loop.
      
      Transaction transaction = new Transaction();
      while (!quit) {
         // Transaction object
         String type = transaction.getType();

         // now using the correct .equals() for comparison instead of ==.
         if (type.equals("Transfer")) {
            transaction.getSender();
            System.out.printf("Transferred: $%.2f\n", myAccount.getTransfers());
         }

         else if (type.equals("Withdrawal")) {
            System.out.printf("Withdrew: $%.2f\n", myAccount.getWithdrawals());
         }

         else if (type.equals("Deposit")) {
            System.out.printf("Deposited: $%.2f\n", myAccount.getDeposits());
         }

         else if (type.equals("Balance")) {
            System.out.printf("Balance: $%.2f\n", myAccount.getBalance());
         }

         else if (type.equals("Add Customer")) {
            customer.customersBalance.add(myAccount.getBalance());
            myAccount.resetBalance();
            System.out.printf("Added Customer: %s %s ****%d\n", customer.getFirst_name(), customer.getLast_name(),
                  customer.getAccount_num() % 10000);
         }

         else {
            customer.customersBalance.add(myAccount.getBalance());
            quit = true;
         }
      }

      

      // Bank object
      Bank bank = new Bank();
      System.out.println(bank.getBank_name() + "\n" + bank.getBank_address());

      // Random dates
      RandomBankStatementDate date = new RandomBankStatementDate();
      System.out.println(date.getRandom_Date());

      // Testing Arraylist
      for (int i = 0; i < customer.customersFirstName.size(); i++) {
      System.out.print("\nCustomer: " + customer.customersFirstName.get(i) + " " + customer.customersLastName.get(i)+"\t\t");
      System.out.print("Account Number: " + customer.customersAccountNum.get(i) + "\n");
      
      System.out.println("Type:" + transaction.typeArray.get(i));
      
      
      System.out.printf("\t\t\t\tTotal Balance $%.2f\n", customer.customersBalance.get(i));
   }
      

   }

}
