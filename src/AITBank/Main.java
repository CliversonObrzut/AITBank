/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package AITBank;
//
///**
// *
// * @author Cliverson
// */
//public class Main
//{
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args)
//    {
//        testSavingsAccount();   //
//        testNetSaverAccount();  // Test methods created to initialize one account of each type and test their methods
//        testChequeAccount();    //
//        testFixedAccount();     //
//    }
//
//    public static void testSavingsAccount()
//    {
//        SavingsAccount sa = new SavingsAccount("0001", "Cliverson", 5000);
//
//        System.out.println("-----------SAVINGS ACCOUNT----------\n");
//        System.out.println(sa.toString());
//
//        sa.withdraw(0);
//        System.out.println(ATM.getMessage());
//        System.out.println(sa.toString());
//
//        sa.withdraw(1500);
//        System.out.println(ATM.getMessage());
//        System.out.println(sa.toString());
//
//        sa.withdraw(785);
//        System.out.println(ATM.getMessage());
//        System.out.println(sa.toString());
//
//        sa.withdraw(460);
//        System.out.println(ATM.getMessage());
//        System.out.println(sa.toString());
//
//        sa.withdraw(600);
//        System.out.println(ATM.getMessage());
//        System.out.println(sa.toString());
//
//        sa.setDailyWithdrawLimit(12000);
//        System.out.println(ATM.getMessage());
//        System.out.println(sa.toString());
//
//        sa.setDailyWithdrawLimit(10);
//        System.out.println(ATM.getMessage());
//        System.out.println(sa.toString());
//
//        sa.setDailyWithdrawLimit(1500);
//        System.out.println(ATM.getMessage());
//        System.out.println(sa.toString());
//
//        sa.withdraw(600);
//        System.out.println(ATM.getMessage());
//        System.out.println(sa.toString());
//
//        sa.applyInterest();
//        System.out.println(ATM.getMessage());
//        System.out.println(sa.toString());
//
//        sa.withdraw(600);
//        System.out.println(ATM.getMessage());
//        System.out.println(sa.toString());
//    }
//
//    public static void testNetSaverAccount()
//    {
//        NetSaverAccount na = new NetSaverAccount("0002", "Cliverson", 1000);
//
//        System.out.println("\n-----------NETSAVER ACCOUNT----------\n");
//        System.out.println(na.toString());
//
//        na.withdraw(0);
//        System.out.println(ATM.getMessage());
//        System.out.println(na.toString());
//
//        na.withdraw(1500);
//        System.out.println(ATM.getMessage());
//        System.out.println(na.toString());
//
//        na.withdraw(750);
//        System.out.println(ATM.getMessage());
//        System.out.println(na.toString());
//
//        na.withdraw(445);
//        System.out.println(ATM.getMessage());
//        System.out.println(na.toString());
//
//        na.withdraw(200);
//        System.out.println(ATM.getMessage());
//        System.out.println(na.toString());
//
//        na.withdraw(400);
//        System.out.println(ATM.getMessage());
//        System.out.println(na.toString());
//
//        na.applyInterest();
//        System.out.println(ATM.getMessage());
//        System.out.println(na.toString());
//
//    }
//
//    public static void testChequeAccount()
//    {
//        ChequeAccount ca = new ChequeAccount("0003", "Cliverson", 1000);
//
//        System.out.println("\n-----------CHEQUE ACCOUNT----------\n");
//        System.out.println(ca.toString());
//
//        ca.withdraw(0);
//        System.out.println(ATM.getMessage());
//        System.out.println(ca.toString());
//
//        ca.withdraw(12000);
//        System.out.println(ATM.getMessage());
//        System.out.println(ca.toString());
//
//        ca.withdraw(1500);
//        System.out.println(ATM.getMessage());
//        System.out.println(ca.toString());
//
//        ca.withdraw(738);
//        System.out.println(ATM.getMessage());
//        System.out.println(ca.toString());
//
//        ca.withdraw(300);
//        System.out.println(ATM.getMessage());
//        System.out.println(ca.toString());
//
//        ca.withdraw(200);
//        System.out.println(ATM.getMessage());
//        System.out.println(ca.toString());
//    }
//
//    public static void testFixedAccount()
//    {
//        FixedAccount fa = new FixedAccount("0004", "Cliverson", 1000, 3);
//
//        System.out.println("------------FIXED ACCOUNT-----------\n");        
//        System.out.println(fa.toString());
//        
//        fa.withdraw(0);
//        System.out.println(ATM.getMessage());
//        System.out.println(fa.toString());
//        
//        fa.withdraw(12000);
//        System.out.println(ATM.getMessage());
//        System.out.println(fa.toString());
//        
//        fa.withdraw(1500);
//        System.out.println(ATM.getMessage());
//        System.out.println(fa.toString());
//        
//        fa.withdraw(738);
//        System.out.println(ATM.getMessage());
//        System.out.println(fa.toString());
//        
//        fa.withdraw(300);
//        System.out.println(ATM.getMessage());
//        System.out.println(fa.toString());
//        
//        fa.withdraw(500);
//        System.out.println(ATM.getMessage());
//        System.out.println(fa.toString());
//        
//        fa.applyInterest();
//        System.out.println(ATM.getMessage());
//        System.out.println(fa.toString());
//        
//        fa.setContractDate("28-04-2017");
//        System.out.println(ATM.getMessage());
//        System.out.println(fa.toString());
//        
//        fa.setEarlyWithdraw(false);
//        System.out.println(ATM.getMessage());        
//        System.out.println(fa.toString());
//        
//        fa.applyInterest();
//        System.out.println(ATM.getMessage());
//        System.out.println(fa.toString());
//        
//    }
//}
