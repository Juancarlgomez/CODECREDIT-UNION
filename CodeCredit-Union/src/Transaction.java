import java.util.Scanner;
public class Transaction {
    private String type;
   private String sender;
   private double amount;
   char select;
   Scanner input = new Scanner(System.in);

   public Transaction(String type, String sender, double amount) {
      this.type = type;
      this.sender = sender;
      this.amount = amount;
   }

   public String getType() {
      System.out.println("Enter 1 for Deposit, 2 for Withdrawal, 3 for Transfer");
      select = input.next().charAt(0);
      switch (select) {
         case '1': 
            type = "Deposit";
            break;

         case '2':
            type = "Withdrawal";
            break;

         case '3':
         type = "Transfer";
         break;

         default:
         System.out.println("Error: Please enter a valid option");
            break;
      }
      return type;
   }

   public String getSender() {
      System.out.println("Enter the sender's Full Name");
      sender = input.next();
      return sender;
   }

   public double getAmount() {
      System.out.println("Enter the amount");
      amount = input.nextDouble();
      return amount;
   }
}
