
package account;

public class Main {
    public static void main (String[] arg){
        Account testAccount = new Account(1122,20_000,4.5);
       
        
       if( testAccount.withdraw(300000)){
           System.out.println("Withdraw successfully");
       }else {
           System.out.println("Don't have enought balance for withdraw.");
       }
        testAccount.deposit(3000);
        System.out.println("Id: "+testAccount.getId()+
                "\nBalance: "+testAccount.getBalance()+
                "\nAnnual Interest Rate: "+testAccount.getAnnualInterestRate()+
                "\nDate: "+testAccount.getDateCreated());
        System.out.println(" ");
        testAccount.setId(2345);
        testAccount.setBalance(200000000);
        testAccount.setAnnualInterestRate(5.7);
        testAccount.deposit(3000000);
        testAccount.withdraw(4596);
        System.out.println("Id: "+testAccount.getId()+
                "\nBalance: "+testAccount.getBalance()+
                "\nAnnual Interest Rate: "+testAccount.getAnnualInterestRate()+
                "\nDate: "+testAccount.getDateCreated());
    }
}
