public class Bank {
   public String Bank_name;
   public String Bank_address;

   public String getBank_name() {
      // FABIAN MERGED START
      Bank_name = ("\n|                MOUNTAIN AMERICA CREDIT UNION \t\t|\r\n");
      return Bank_name;
      // FABIAN MERGED END
   }
   
   public String getBank_address() {
      Bank_address = ("753 S Jordan Pkwy, South Jordan, UT, 84095");
      return Bank_address;
   }
}
