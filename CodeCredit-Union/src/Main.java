
public class Main {
   public static void main(String[] args) {

      // creates the boolean for looping
      boolean quit = false;

      // FABIAN MERGED START
      System.out.println(
         " ______                  __  __  __     _______         __                 ______  __  __  __  __                 _______                __                    \r\n"+ //
         "|      |.----..-----..--|  ||__||  |_  |   |   |.-----.|__|.-----..-----. |   __ \\|__||  ||  ||__|.-----..-----. |     __|.--.--..-----.|  |_ .-----..--------.\r\n"+ //
         "|   ---||   _||  -__||  _  ||  ||   _| |   |   ||     ||  ||  _  ||     | |   __ <|  ||  ||  ||  ||     ||  _  | |__     ||  |  ||__ --||   _||  -__||        |\r\n"+ //
         "|______||__|  |_____||_____||__||____| |_______||__|__||__||_____||__|__| |______/|__||__||__||__||__|__||___  | |_______||___  ||_____||____||_____||__|__|__|\r\n"+ //
         "                                                                                                         |_____|          |_____|                              \r\n"+// 
         "                                                                                                                                                               \r\n"+ //
         "\n");
      // FABIAN MERGE END

      // Customer object
      Customer customer = new Customer();
      customer.getFirst_name();
      customer.getLast_name();
      // prints out only the last 4 digits of the account number
      System.out.println("Account number: ****" + customer.getAccount_num() % 10000);

      // BankAccount object Transaction object
      BankAccount myAccount = new BankAccount();
      Transaction transaction = new Transaction();
      // loops only the Transaction.getType object,
      while (!quit) {
         String type = transaction.getType();

         // now using the correct .equals() for comparison instead of ==.
         if (type.equals("Transfer")) {
            transaction.getSender();
            System.out.printf("Transfer successful! %nTotal Transferred: $%.2f%n", myAccount.getTransfers());
         }

         else if (type.equals("Withdrawal")) {
            System.out.printf("Withdrawal successful! %nTotal Withdrew: $%.2f%n", myAccount.getWithdrawals());
         }

         else if (type.equals("Deposit")) {
            System.out.printf("Deposit successful! %nTotal Deposited: $%.2f%n", myAccount.getDeposits());
         }

         else if (type.equals("Balance")) {
            System.out.printf("Balance: $%.2f%n", myAccount.getBalance());
         }

         else if (type.equals("Add Customer")) {
            customer.customersBalance.add(myAccount.getBalance());
            myAccount.resetBalance();
            System.out.printf("Added Customer: %s %s ****%d%n", customer.getFirst_name(), customer.getLast_name(),
            customer.getAccount_num() % 10000);
            System.out.println("\u001B[43m" +  "Deposit at least $1 too keep account open" + "\u001B[0m");
         }

         else {
            customer.customersBalance.add(myAccount.getBalance());
            quit = true;
         }
      }

      // Bank Receipt
      // fabian margins
      System.out.print(" ________________________________________________________\r\n|\t\t\t\t\t\t\t|");
      // Bank object
      Bank bank = new Bank();
      System.out.println(bank.getBank_name() + "|\t\t\t\t\t\t\t|\r\n|" + bank.getBank_address()+ "\t\t|\r\n|\t\t\t\t\t\t\t|");

      // Random dates
      RandomBankStatementDate date = new RandomBankStatementDate();
      System.out.println("|"+ date.getRandomDate() + "\t\t\t\t|\r\n|\t\t\t\t\t\t\t|");
      
      // Loops through the list of customers first name 
      for (int i = 0; i < customer.customersFirstName.size(); i++) {
          System.out.print("|\t\t\t\t\t\t\t|\r\n|Customer: " + customer.customersFirstName.get(i) +" ");
         int length = customer.customersFirstName.get(i).length();
         String shortLName;
         // if first name is longer than 5 characters only print out the first letter of the last name
         if (length > 5) {
            shortLName = customer.customersLastName.get(i) ;
            char let0 = shortLName.charAt(0);
            System.out.print(let0 + "\t");
            System.out.print("Account Number: " + customer.customersAccountNum.get(i)+"\t|\r\n");
         } else {
            //prints full last name if first name is > 5 characters long
         System.out.print(customer.customersLastName.get(i)+"\t");
         System.out.print("Account Number: " + customer.customersAccountNum.get(i) + "\t|\r\n");
         }
      
         System.out.println("|Type: " + transaction.typeArray.get(i)+ "\t\t\t\t\t\t|\r\n|\t\t\t\t\t\t\t|");
      
      
         System.out.printf("|\t\t\t\tTotal Balance $%.2f\t|\r%n", customer.customersBalance.get(i));
   }
      System.out.print("|_______________________________________________________|\r\n");

   }

}