import java.util.ArrayList;
import java.util.Scanner;

public class Transaction {
   private String type;
   private String sender;
   ArrayList<String> typeArray = new ArrayList<>(); // testing with arrayList
   // removed amount double it is now used in the bankAccount object
   char select;
   String error = "\u001B[41m";
   String resetColor = "\u001B[0m";
   Scanner input = new Scanner(System.in);

   public String getType() {
      // FABIAN MERGED STARTS HERE
      select = 0;
      System.out.println("\n*******************MENU*****************");
      System.out.println("* Options:                            **");
      System.out.println("* 1. Deposit.                         **");
      System.out.println("* 2. Withdrawal.                      **");
      System.out.println("* 3. Transfer.                        **");
      System.out.println("* 4. Balance.                         **");
      System.out.println("* 5. Add Customer.                    **");
      System.out.println("* 6. Quit.                            **");
      System.out.println("****************************************");

      System.out.println(" ");
      while (select != '1' && select != '2' && select != '3' && select != '4' && select != '5' && select != '6') {
         System.out.print("Please, choose an Option of the Menu: ");
         // FABIAN MERGED ENDS HERE
         select = input.next().charAt(0);
         switch (select) {
            case '1':
               type = "Deposit";
               typeArray.add(type);
               break;

            case '2':
               type = "Withdrawal";
               break;

            case '3':
               type = "Transfer";
               break;

            case '4':
               type = "Balance";
               break;

            case '5':
               type = "Add Customer";
               break;

            case '6':
               type = "Quit";
               break;

            default:
               System.out.println(error + "Error: Please enter a valid option" + resetColor);

               break;
         }
      }
      return type;
   }

   public String getSender() {
      if (type.equals("Transfer")) {

         System.out.println("Enter the sender's Full Name:" + input.nextLine()); // input.nextLine(); is broken down
                                                                                 // bellow
         sender = input.nextLine();
         return sender;
      }

      else {
         return null; // this returns nothing
      }
   }
    
}
