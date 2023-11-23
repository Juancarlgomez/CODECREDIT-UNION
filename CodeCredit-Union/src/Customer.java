import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class Customer {
    private String first_name;
    private String last_name;
    private int account_num;
    Random RadomAccountNum = new Random();
    Scanner input = new Scanner(System.in);
    ArrayList<String> customers = new ArrayList<String>();
 
    public Customer(String first_name, String last_name, int account_num) {
       this.first_name = first_name;
       this.last_name = last_name;
       this.account_num = account_num;
    }
 
    public String getFirst_name() {
     System.out.println("Enter your first name");
     first_name = input.nextLine();
       return first_name;
    }
 
    public String getLast_name() {
       System.out.println("Enter your last name");
       last_name = input.nextLine();
       
       return last_name;
    }
 
    public int getAccount_num() {
       // creates a random account number
       account_num = RadomAccountNum.nextInt(24500000,24599999);
       return account_num;
    }
}
