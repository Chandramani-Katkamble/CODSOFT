package com.ams.client;

import java.util.Scanner;

import com.ams.servicImpl.Sbi;

public class Test {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		Sbi ac=new Sbi();
		
		while(true) {
		System.out.println("---Choose from Following Options---\n"+"1.Set Pin \n"+"2.Deposit Money\n"+"3.withdraw Money \n"+"4.Balance check");
        int op=sc.nextInt();
        
        switch(op) {
        
        case 1:
        	ac.Pin();
        	break;
        	
        case 2:
        	ac.depositMoney();
        	break;
        	
        case 3:
        	
        	ac.withdrawl();
        	break;
        	
        case 4:
        	ac.balanceCheck();
        	break;
        	
        	
        default:
        	System.out.println("You have entered wrong choice!");
        	
        }
        
	}

  }
}
