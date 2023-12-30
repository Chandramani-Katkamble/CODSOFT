package com.ams.servicImpl;
import java.util.Scanner;

import com.ams.model.Account;


public class Sbi  {
	
	
	Scanner sc=new Scanner(System.in);
	
	Account ac=new Account();
	
	

	public void depositMoney() {
		System.out.println("Enter Pin");
		int pIn=sc.nextInt();
		
		if(pIn==ac.getPiN()) {
			System.out.println("enter Amount to be Deposite:");
			double Damount=sc.nextDouble();
			
			double Balance=ac.getBalance()+Damount;
			System.out.println("Updated Balance :");
			ac.setBalance(Balance);
			System.out.println(Balance);
			
		}else {
			System.out.println("Incorrect Pin");
		}
		
		
	}
	public void withdrawl() {
		System.out.println("Enter Pin \n");
		int pIn=sc.nextInt();
		
		if(pIn==ac.getPiN()) {
			System.out.println("enter Amount to be Withdraw\n");
			double Wamount=sc.nextDouble();
			
			if(Wamount > ac.getBalance()) {
				System.out.println("Insufficient Balance");
			}else {
            double Balance=ac.getBalance()-Wamount;
            System.out.println("Congratulations Transaction successful\n");
            System.out.println("Please collect your cash\n");
			System.out.println("Updated Balance \n");
			ac.setBalance(Balance);
     		System.out.println(Balance);
			}
		}else {
			System.out.println("Incorrect Pin \n");
		}
		
	}
	
	public void balanceCheck() {
		System.out.println("Enter Pin \n");
		int pIn=sc.nextInt();
		
		if(pIn==ac.getPiN()) {
			
			System.out.println(ac.getBalance());
			
			
		}else {
			System.out.println("Incorrect Pin");
		}
	}

	
	public void Pin() {
		System.out.println("Enter Account Type");
		String accType=sc.next();
		ac.setAccType(accType);
		
		System.out.println("Enter account number");
		long accNo=sc.nextLong();
		ac.setAccNo(accNo);
		
		
		System.out.println("Enter your Mobile number");
		long MobileNo=sc.nextLong();
		ac.setMobNo(MobileNo);
		
		System.out.println("Set 4 digit pin");
		int pin=sc.nextInt();
		ac.setPiN(pin);
		
		
	}

}
