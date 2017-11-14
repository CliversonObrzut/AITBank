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
public class Session
{
    public SavingsAccount sva;
    public NetSaverAccount nsa;
    public ChequeAccount cqa;
    public FixedAccount fxa;
    public String function = "";
    public String account = "";
    public double value = 0;
    
    public Session()
    {
        sva = new SavingsAccount("0001","MATTHEW CARR", 2000);
        nsa = new NetSaverAccount("0002","ALBERT EINSTEIN", 3000);
        cqa = new ChequeAccount("0003","THOMAS JEFFERSON", 5000);
        fxa = new FixedAccount("0004","ISAAC NEWTON", 9000, 3);    
    }
}
