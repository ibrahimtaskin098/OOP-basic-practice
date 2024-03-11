
package transaction;

import client.Client;
import java.util.ArrayList;

public class Main{
    public static void main(String[] arg){
        ArrayList<Account> accounts = new ArrayList<Account>();
        
        Client client = new Client(1234,"babul","12345678909");
        accounts.add(new Account(1,1000,1.5,client));
        accounts.add(new Account(2,2000,2.5,client));
        
        accounts.get(0).withdraw(5000);
        accounts.get(0).deposit(2000);
        accounts.get(0).withdraw(500);
        
        
        accounts.get(0).deposit(1000);
        accounts.get(0).deposit(500);
        
        accounts.get(1).withdraw(500);
        accounts.get(1).withdraw(1000);
        
        accounts.get(1).deposit(1000);
        accounts.get(1).deposit(3000);
        accounts.get(1).withdraw(2000);
        
        for(Account account:accounts){
            System.out.println("Accounts client :"+account.getClient());
            System.out.println("Account Id: "+account.getId()+":");
            System.out.println("W:"+account.countTransaction('W'));
           
            System.out.println("D:"+account.countTransaction('D'));
      
    }
        
        
        System.out.println(accounts.get(0));
        System.out.println(accounts.get(1));
}
}








