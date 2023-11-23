public class Bank {
    public String Bank_name;
    public String Bank_address;

    public Bank(String Bank_name, String Bank_address) {
        this.Bank_name = Bank_name;
        this.Bank_address = Bank_address;
    }

    public String getBank_name() {
        return Bank_name;
    }

    public String getBank_address() {
        return Bank_address;
    }
}