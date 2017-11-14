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
public class NetSaverAccount extends Account implements Interest
{

    private final double DAILY_WITHDRAW_LIMIT; // withdraw limit for the account. It can not be changed by the customer    
    private double withdrawnToday; // The quantity withdrawn in the current day
    private final double MONTHLY_INTEREST_RATE; // defined monthly interest rate for Savings Account
    
    public NetSaverAccount(String accountNumber, String customerName, double accountBalance)
    {
        super(accountNumber, customerName, accountBalance);
        MONTHLY_INTEREST_RATE = 0.02;
        DAILY_WITHDRAW_LIMIT = 500;
        withdrawnToday = 0;
    }

    public double getDAILY_WITHDRAW_LIMIT()
    {
        return DAILY_WITHDRAW_LIMIT;
    }

    public double getWithdrawnToday()
    {
        return withdrawnToday;
    }

    public void setWithdrawnToday(double withdrawnToday)
    {
        this.withdrawnToday = withdrawnToday;
    }

    public double getMONTHLY_INTEREST_RATE()
    {
        return MONTHLY_INTEREST_RATE;
    }
    
    
    public double getAvaliableLimitToday() // It returns the difference between the daily set limit and the value already withdraw during the day
    {
        return DAILY_WITHDRAW_LIMIT-withdrawnToday;
    }
    
    
    @Override
    public void withdraw(double amount)
    {
        if (amount > 0) // check if customer is trying to withdraw the amount of $0.00
        {
            if ((getAccountBalance() - amount) >= 0) // check if the account balance will be overdrawn
            {
                if(amount <= getAvaliableLimitToday()) // check the amount against the today limit still available
                {
                    if(ATM.checkNotes(amount)) // if the amount is multiple of the notes values (100, 50 and 20) it allows the withdraw
                    {
                        setAccountBalance(getAccountBalance() - amount);
                        withdrawnToday += amount;
                        ATM.messageColor = "Green";
                        ATM.setMessage("Successfully withdrawn " + ATM.decimalNumber.format(amount));
                    }
                    else
                    {
                        ATM.messageColor = "Red";
                        ATM.setMessage("Sorry, the amount of " + ATM.decimalNumber.format(amount) + " does\nnot match the notes 100, 50 and 20.\nPlease, try again!");
                    }
                }                
                else
                {
                    ATM.messageColor = "Red";
                    ATM.setMessage("Sorry, withdraw of " + ATM.decimalNumber.format(amount) + " failed!\nToday`s avaliable amount: " + ATM.decimalNumber.format(getAvaliableLimitToday())); 
                }
            }
            else
            {
                ATM.messageColor = "Red";
                ATM.setMessage("Sorry, you don't have enough funds to withdraw " + ATM.decimalNumber.format(amount) + "\nCurrent balnce: " + ATM.decimalNumber.format(getAccountBalance()));
            }
        }
        else
        {
            ATM.messageColor = "Red";
            ATM.setMessage("Sorry, the amount can not be $0.00");
        }
    }

    @Override
    public void applyInterest() // implemented from the interface Interest
    {        
        setAccountBalance(getAccountBalance() * (MONTHLY_INTEREST_RATE+1));
        ATM.messageColor = "Green";
        ATM.setMessage("Monthly interest applied!");
    }
    
    @Override
    public String toString() // overrides the method toString from super class with information about this account
    {
        return super.toString() + "Daily withdraw Limit: \t" + ATM.decimalNumber.format(DAILY_WITHDRAW_LIMIT) + "\nAvailable today: \t" + ATM.decimalNumber.format(getAvaliableLimitToday()) + "\n";
    }
    
}
