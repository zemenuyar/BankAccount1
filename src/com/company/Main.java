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

        Scanner Sc = new Scanner(System.in);

        for (Account newaccount: myAccount){
            if(newaccount.getPIN()==userInputPINtNumber && newaccount.getNumber()==userAccountNum) {
                //System.out.println("It is working!!");
                double current = newaccount.getBalance();
                System.out.println("do you want to deposit or withdrawal");
                String userInput = Sc.next();// userInput == "deposti"
                if (userInput.equalsIgnoreCase("deposit")){
                    System.out.println("crurrent balance = " + newaccount.getBalance());
                    System.out.println("how much you want deposit");
                    double deposit = Sc.nextDouble(); // deopsit = 100
                    System.out.println(" new balance");
                    double newbalance = newaccount.getBalance() + deposit;
                    System.out.println(newbalance);
                }else if (userInput.equalsIgnoreCase("withdrawal")) {
                    System.out.println("crurrent balance = " + newaccount.getBalance());
                    System.out.println("how much you want withdrawal");
                    double withdrawal = Sc.nextDouble();
                    System.out.println(" new balance");
                    double newbalance = newaccount.getBalance() - withdrawal;
                    System.out.println(newbalance);
                }
            }
/*
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
//                newaccount.getBalance()-newaccount.


//                System.out.println("Enter the balance");
//                double userInputBalance = Sc.nextDouble();
                System.out.println("deposit amount");
                double userDepositAmount = Sc.nextDouble();
                newaccount.deposit(userDepositAmount);
                System.out.println(newaccount.getBalance());
//                System.out.println("would you like to deposit more Y(yes)or N(no)");
//                userDepositAmount = Sc.nextDouble();
            }else if (newaccount.withdrawal())
                System.out.println("withdrawal amount");
                double usrWithdrawalAmount = Sc.nextDouble();
                newaccount.withdrawal(usrWithdrawalAmount);
                System.out.println(newaccount.getBalance());
//                System.out.println("balance - withdrawal");
//                System.out.println("new balance = balance - withdrawal amount");

*/

                return true;
            }
        return false;
    }

}
