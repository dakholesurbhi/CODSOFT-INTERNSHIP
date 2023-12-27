package com.atm;
import java.util.Scanner;

		public class Main1 {
		    public static void main(String[] args) throws Exception {
		        
		        BankAccount userAccount = new BankAccount(1000.0);

		        ATM1 atm = new ATM1(userAccount);

		        Scanner scanner = new Scanner(System.in);

		        while (true) {
		            System.out.println("\nATM Options:");
		            atm.displayOptions();
		            System.out.print("Choose an option (1-4): ");
		            int option = scanner.nextInt();

		            atm.processOption(option);
		            
		            
		        }
		    }
	}


