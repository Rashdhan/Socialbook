/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firsttask;

/**
 *
 * @author user
 */

abstract class Account {

    public abstract void accountDetails();
    public abstract void transaction(double amount);
}


public class BankAccount extends Account{
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    
    
    @Override
    public void accountDetails(){
        System.out.println("hello");
    }
    @Override
    public void transaction(double amount){
        System.out.println("hello");
    }
            
    

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
    public void deposit(double amount){
        balance = amount+balance;
    }

    public void withdraw(double amount){
    
    if (balance < 0){
        System.out.println("Error");
    }
    else{
        System.out.println("Payment ok");
    }
}
    
class SavingsAccount extends BankAccount{
    private double interestRate;
}
        
public double calculateInterest(double interestRate){
    return interestRate*this.getBalance();
}
    
}

class CurrentAccount extends BankAccount {
    @Override
    public void withdraw(double amount) {
        double balance = this.getBalance();
        if(balance < (amount + 2)){
            this.withdraw(amount);
        }
        else{
            System.out.println("Transtion failed");
        }
    }
}



