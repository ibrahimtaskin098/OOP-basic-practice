package client;

import account.Account;
import java.util.ArrayList;

public class Client {

    private int id;
    private String name;
    private String phone;
    private ArrayList<Account> accounts;

    public Client(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        accounts = new ArrayList<Account>();
    }

    public boolean addAccount(Account account) {

        if (accounts.add(account)) {
           System.out.println("Account has been added successfully");
            return true;
        } else {
            System.out.println("Account has been not added yet for some technical issues. ");
            return false;
        }

    }

    public boolean removeAccount(int accountId) {
        for (Account account : accounts) 
            if (account.getId() == accountId) {
                accounts.remove(accountId);
                System.out.println("Account has been deleted");
                return true;
            } else {
                System.out.println("Account hsan't found.");
       
            }
           return false;
        
       
    }
    
    public String toString(){
        String str = this.id+ " "+this.name+" "+this.phone+"\n";
     
        for(Account account : accounts)
            
        str+= accounts.toString()+"\n";
      
       return str;
       
        
         
    }
 
    
}
