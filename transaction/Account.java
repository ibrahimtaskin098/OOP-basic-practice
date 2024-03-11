package transaction;

import client.Client;
import java.util.ArrayList;
import java.util.Date;


public class Account{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date date;
    private Client client;
    private ArrayList<Transaction> transactions;
    
    public Account(int id, double balance, double annualInterestRate, Client client){
        this.id =id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.client = client;
        date = new Date();
        transactions = new ArrayList<Transaction>();
    }
    public boolean withdraw(double amount){
        if(balance>amount){
            System.out.println(" Withdraw successfull");
            balance -= amount;
            transactions.add(new Transaction('W',amount,balance,"Withdraw "+amount));
            return true;
        }else{
            System.out.println("Withdraw failed");
            return false;
        }
    }
    
    public void deposit(double amount){
        if(amount>0){
            System.out.println(" deposit done");
            balance += amount;
            transactions.add(new Transaction('D',amount,balance,"Withdraw "+amount));
        }else{
            System.out.println(" There is no deposit done yet");
        }
    }
    
    
    public int countTransaction(char type){
        int count =0;
        for(Transaction transaction : transactions){
            if (transaction.getType()==type){
                count++;
            }
           
        }
        return count;
    }
    
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double balance){
        this.balance= balance;
    }
    public double getAnnualInterestrate(){
        return this.annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    public Date getCreated(){
        return this.date;
    }
    public void setCreated(Date date){
        this.date =date;
    }
    public Client getClient(){
        return this.client;
    }
    public void setClient(Client client){
        this.client = client;
    }
    public String toString(){
        return "Account {"+" Id = "+id+" Balance = "+balance+
                " AnnualInterestRate = "+annualInterestRate+
                " Date"+date+" Client = "+client+" Transaction = "+transactions+"}\n";
    }
}


















/*
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date created;
    private Client client;
    private ArrayList<Transaction> transactions;
    
    public Account(int id, double balance, double annualInterestRate, Client client){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.client = client;
        created = new Date();
        transactions = new ArrayList<Transaction>();
    }
    public boolean withdraw(double amount){
        if (balance>=amount){
            balance-=amount;
            transactions.add(new Transaction('W',amount,this.balance,"Withdrawn: "+amount));
                     System.out.println("Transaction successful");
                   return true;
        }else {
            System.out.println("Transaction failed");
            return false;
        }
        
    }  
        
    
    public void deposit(double amount){
        balance+= amount;
        transactions.add(new Transaction('D',amount,this.balance,"deposit "+amount));
        
    }
    public int countTransaction(char type){
          int count = 0;
        for(Transaction transaction :transactions){
          if(transaction.getType() == type)
              count++;
          
        } 
       
        
        return count;
            
                
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
     public String toString(){
         return this.id+ " "+this.balance+ " "+
                 this.annualInterestRate+" "+
                 this.created+" "+ this.client+
                 "\n" +this.transactions+"\n";
     }
    
}
*/