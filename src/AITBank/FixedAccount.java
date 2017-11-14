/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AITBank;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Cliverson
 */
public class FixedAccount extends Account implements Interest
{

    private final double CONTRACT_INTEREST_RATE;  // interest rate applied if the customer does not withdraw any value before the end of contract
    private final int CONTRACT_MONTHS; // duration of contract in months
    private boolean earlyWithdraw; // keeps the information if customer withdraw before or after contract finishes
    private LocalDate contractEndDate; // date when the contract started
    private final LocalDate contractStartDate; // date when the contract ends


    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // object to format the output of dates

    public FixedAccount(String accountNumber, String customerName, double accountBalance, int contractMonths)
    {
        super(accountNumber, customerName, accountBalance);
        CONTRACT_MONTHS = contractMonths;
        CONTRACT_INTEREST_RATE = 0.03 * contractMonths;
        earlyWithdraw = false;
        contractStartDate = LocalDate.now();
        contractEndDate = LocalDate.now().plusMonths(contractMonths);
    }

    public double getCONTRACT_INTEREST_RATE()
    {
        return CONTRACT_INTEREST_RATE;
    }

    public int getCONTRACT_MONTHS()
    {
        return CONTRACT_MONTHS;
    }

    public String getActualDate()
    {
        return formatter.format(LocalDate.now());
    }

    public String getContractEndDate()
    {
        return formatter.format(contractEndDate);
    }
    
    public String getContractStartDate()
    {
        return formatter.format(contractStartDate);
    }

    public void setContractDate(String contractDate)
    {
        this.contractEndDate = LocalDate.parse(contractDate, formatter);
        ATM.messageColor = "Green";
        ATM.setMessage("Contract date updated sucessfully!");
    }
    
    public String getEarlyWithdraw()
    {
        if(isEarlyWithdraw())
            return "True";
        else
            return "False";
    }

    public boolean isEarlyWithdraw()
    {
        return earlyWithdraw;
    }
    
    public void setEarlyWithdraw(boolean earlyWithdraw)
    {
        this.earlyWithdraw = earlyWithdraw;
    }

    @Override
    public void withdraw(double amount)
    {
        if (amount > 0) // check if customer is trying to withdraw the amount of $0.00
        {
            if (amount <= getWL_MAX()) // check if the customer is not trying to withdraw a value higher then the max per transaction
            {
                if ((getAccountBalance() - amount) >= 0) // check if the account balance will be overdrawn
                {
                    if (ATM.checkNotes(amount)) // if the amount is multiple of the notes values (100, 50 and 20) it allows the withdraw
                    {
                        setAccountBalance(getAccountBalance() - amount);
                        ATM.messageColor = "Green";
                        ATM.setMessage("Successfully withdrawn " + ATM.decimalNumber.format(amount));
                        if (LocalDate.now().isBefore(contractEndDate)) // check if client is withdrawing before the end of the contract
                        {
                            setEarlyWithdraw(true);
                        }
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
                    ATM.setMessage("Sorry, you don't have enough funds to withdraw " + ATM.decimalNumber.format(amount) + "\nCurrent balnce: " + ATM.decimalNumber.format(getAccountBalance()));
                }
            }
            else
            {
                ATM.messageColor = "Red";
                ATM.setMessage("Sorry, the max limit per withdraw is " + ATM.decimalNumber.format(getWL_MAX()));
            }
        }
        else
        {
            ATM.messageColor = "Red";
            ATM.setMessage("Sorry, the amount can not be $0.00");
        }
    }

    @Override
    public void applyInterest()
    {
        if (!earlyWithdraw) // only apply the interest if the early withdraw is false.
        {
            setAccountBalance(getAccountBalance() * (CONTRACT_INTEREST_RATE + 1));
            ATM.messageColor = "Green";
            ATM.setMessage("Contract interest applied!");
        }
        else
        {
            ATM.messageColor = "Red";
            ATM.setMessage("Contract interest not applied due early withdraw!");
        }
    }

    @Override
    public String toString() // overrides the method toString from super class with information about this account
    {
        return super.toString() + "Begin of Contract: \t" + getContractStartDate() + "\nEnd of Contract: \t" + getContractEndDate() + "\nEarly withraw: \t\t" + earlyWithdraw + "\n";
    }
}
