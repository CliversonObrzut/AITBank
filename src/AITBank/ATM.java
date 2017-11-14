/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AITBank;

import java.text.DecimalFormat;

/**
 *
 * @author Cliverson
 */
public class ATM
{
    public static DecimalFormat decimalNumber = new DecimalFormat("$#.00"); // object utilized to format the output monetary values
    private static String message; // ATM message display the status of each transaction attempt
    public static String messageColor = "";
    
    public static String getMessage()
    {
        return message;
    }

    public static void setMessage(String message)
    {
        ATM.message = message;
    }
    
    public static boolean checkNotes(double amount) // Check if the withdraw amount matches the notes 20, 50, 100 and return true or false
    {
        boolean valid = false;
        
        if(amount != 10 && amount != 30 && amount%10 == 0) // apart from 10 and 30 all the oher values where the 
            valid = true;                          // amount divided by 10 lefts 0 matches the notes and return true
        
        return valid;        
    }
}