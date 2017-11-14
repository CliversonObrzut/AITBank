/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AITBank;

/**
 *
 * @author Cliverson
 */
public abstract class Account
{
    private final String ACCOUNT_NUMBER;    //
    private final String CUSTOMER_NAME;     // All types of account has account number, customer name and balance.
    private double accountBalance;          //
    private final double WL_MAX = 10000;        // withdraw limits for the ATM
    private final double WL_MIN = 20;           //
    
    Account (String accountNumber, String customerName, double accountBalance)
    {
        this.ACCOUNT_NUMBER = accountNumber;
        this.CUSTOMER_NAME = customerName;
        this.accountBalance = accountBalance;
    }
    
    public String getACCOUNT_NUMBER()
    {
        return ACCOUNT_NUMBER;
    }

    public String getCUSTOMER_NAME()
    {
        return CUSTOMER_NAME;
    }

    public double getWL_MAX()
    {
        return WL_MAX;
    }

    public double getWL_MIN()
    {
        return WL_MIN;
    }    

    public double getAccountBalance()
    {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance)
    {
        this.accountBalance = accountBalance;
    }

    // toString is a method that overrides the super class method and shows the information about the account
    @Override
    public String toString()
    {
        return "Account number:\t" + ACCOUNT_NUMBER + "\nCustomer name: \t" + CUSTOMER_NAME + "\n\nAccount balance: \t" + ATM.decimalNumber.format(accountBalance) + "\n\n";
    }
    
    // abstract method that needs to be implemented in all children classes
    public abstract void withdraw(double amount);
    
    public void deposit(double amount)
    {
        if(amount > 0)
        {
            accountBalance = accountBalance + amount;
            ATM.messageColor = "Green";
            ATM.setMessage("Successfully deposit " + ATM.decimalNumber.format(amount));
        }
        else
        {
            ATM.messageColor = "Red";
            ATM.setMessage("Sorry, the amount to withdraww can not be $0.00");
        }
    }
}
