package tr.com.testing;

public class Account {

    String name = "defaultName";
    String number = "defaultNumber";

    public void updateAccountDetails(String newName, String newNumber) {
        name = newName;
        number = newNumber;
    }

    public void showAccountDetails() {
        System.out.println("Account name= " + name);
        System.out.println("Account number= " + number);
    }
}


