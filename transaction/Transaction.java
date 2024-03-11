package transaction;

import java.util.Date;


public class Transaction{
    private char type;
    private double amount;
    private double balance;
    private Date date;
    private String description;
    
    public Transaction(char type, double amount, double balance, String description){
        this.type = type;
        this.amount = amount;
        this.balance = balance ;
        this.description = description;
        date = new Date();
    
}
    public char getType(){
        return this.type;
    }

    @Override
    public String toString() {
        return "Transaction"
                + "{" + "type=" + type +
                ", amount=" + amount + ", balance=" + 
                balance + ", date=" + date + ", description=" +
                description + '}'+"\n";
    }
   
}











