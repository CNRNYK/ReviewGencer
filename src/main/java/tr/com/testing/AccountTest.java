package tr.com.testing;

import java.util.ArrayList;
import java.util.List;

public class AccountTest {
    public static void main(String[] args) {


        //Array of objects
        //Unlike a traditional array that store values like string,integer,boolean,etc
        //array objects stores Objects. The array elements store the location of the
        //reference variables of the accounts

        Account[] accounts = new Account[4]; //{}
        accounts[0] = new Account();
        accounts[1] = new Account();
        accounts[2] = new Account();
        // Hatali -> accounts[3] = new Account();

        accounts[0].updateAccountDetails("YapiKredi", "IBAN TR123");
        accounts[1].updateAccountDetails("IsBankasi", "IBAN TR124");

        accounts[0].updateAccountDetails("YapiKredi", "IBAN TR123");
        accounts[1].updateAccountDetails("IsBankasi", "IBAN TR124");
        accounts[2].updateAccountDetails("Garanti", "IBAN TR125");
        Account a2 = new Account();
        accounts[3] = a2;
        a2.updateAccountDetails("Finansbank", "IBAN TR126");

        accounts[3] = null;

        System.out.println("For Array Element 0");
        accounts[0].showAccountDetails();

        System.out.println("For Array Element 1");
        accounts[1].showAccountDetails();



        System.out.println("====================");

        List<Account> accountList = new ArrayList<>();

        //I want to create a accountList
        //what kind of objects u want this accountList to hold it ? -  >  accounts belongs to Account class

        accountList.add(new Account());
        accountList.add(new Account());
        accountList.add(new Account());

        Account a1 = new Account();
        accountList.add(a1);

        accountList.get(0).updateAccountDetails("YapiKredi", "IBAN TR123");
        accountList.get(1).updateAccountDetails("IsBankasi", "IBAN TR124");
        accountList.get(2).updateAccountDetails("Garanti", "IBAN TR125");
        a1.updateAccountDetails("Finansbank", "IBAN TR126");

        //accountList.remove(1);

        accountList.get(3).showAccountDetails();
        accountList.remove(3);

        a1.showAccountDetails();




        //Class  - accounts

    }
}
