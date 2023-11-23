public class Main {
    public static void main(String[] args) {
   
        // Bank object
       Bank bank = new Bank("Mountain America Credit Union","753 S Jordan Pkwy, South Jordan, UT, 84095");
       System.out.println( bank.getBank_name() + "\n" + bank.getBank_address() + "\n");
    
       // Transaction object
       Transaction transaction = new Transaction("Transfer", "", 100.00);
       System.out.printf("Transaction type: %s\n Customer: %s\n Amount: $%.2f\n", transaction.getType(), transaction.getSender(), transaction.getAmount());
    
       // Customer object
       Customer customer = new Customer("", "", 0); 
       System.out.println("First Name: " + customer.getFirst_name() + "\n Last Name: " + customer.getLast_name() + "\n Account Number: " + customer.getAccount_num());
       
       // BankAccount object
       BankAccount bankAccount = new BankAccount(1000.00, 500.00, 100.00, 400);
       System.out.printf("deposits: $%.2f\n withdrawals: $%.2f\n transfers: $%.2f\n total: $%.2f\n", bankAccount.getDeposits(), bankAccount.getWithdrawals(), bankAccount.getTransfers(), bankAccount.getTotal());
       
    }
 }

