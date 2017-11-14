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
public class ChequeAccount extends Account
{

    public ChequeAccount(String accountNumber, String customerName, double accountBalance)
    {
        super(accountNumber, customerName, accountBalance);
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
}
