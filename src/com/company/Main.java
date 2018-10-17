package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Account> myAccount = new ArrayList<>();
        myAccount.add(new Account(456,"zemenu",5000,123));
        myAccount.add(new Account(789,"hayilu", 4500, 101));
        myAccount.add(new Account(654,"Jesmy", 6000, 202));

        Scanner Sc = new Scanner(System.in);
        int counter = 0;
        int userInputPINtNumber;
        int userAccountNum;
        do {
            //System.out.println("Enter the UserName");
            //String userInputUsername =Sc.next();
            System.out.println("Enter your PIN Number");
            userInputPINtNumber= Sc.nextInt();
            System.out.println("Enter account number");
            userAccountNum = Sc.nextInt();

            counter++;
            if(counter == 3){
                System.out.println("No more try");
            }
        }while (!checkAccount(myAccount, userInputPINtNumber, userAccountNum) && counter<3);
    }// END MAIN METHOD

    public static boolean checkAccount(ArrayList<Account> myAccount, int userInputPINtNumber, int userAccountNum) {
        for (Account newaccount: myAccount){
            if(newaccount.getPIN()==userInputPINtNumber && newaccount.getNumber()==userAccountNum){
                System.out.println("It is working!!");
                double current = newaccount.getBalance();
//                PRINT OUT THE CURRENT BALANCE
//                PROMPT USER - TO DEPOSIT OR WITHDRAW
//                    Store it in a variable
//                        IF (deposit)
//                                how much you want to withdj
//                                store it in a variable = withdrawAmount
//                                double withdrawTotal = current - withdrawAmount;
//                        ELSE IF(withdraw)
//                            how much you want to deposit
//                            store it in a variable = depositAmount
//                            double depositTotal = current - withdrawAmount;
                newaccount.getBalance()-newaccount.

                Scanner Sc = new Scanner(System.in);
                System.out.println("Enter the balance");
                userInputPINtNumber = Sc.nextInt();
                System.out.println("withdrawal amount");
                userInputPINtNumber = Sc.nextInt();
                System.out.println("balance - withdrawal");
                System.out.println("new balance = balance - withdrawal amount");


                return true;
            }
        }
        return false;
    }


}
