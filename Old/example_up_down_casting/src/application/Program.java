package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
//import entities.SavingsAccount;

public class Program {
	
	public static void main(String[] args) {
		
		List<Account> list = new ArrayList<>();
		Account acc = new Account(1, "Diego", 0.0);
		BusinessAccount bacc = new BusinessAccount(2, "Diego", 0.0, 0.0);
	/*	SavingsAccount sacc = new SavingsAccount(2, "Diego", 0.0, 0.0); */
		
	//	sacc.deposit(100.0);
		
    /*  Upcasting  */
		Account acc2 = bacc;
	/*	Account acc3 = new SavingsAccount(3, "Diego", 0.0, 0.0);  não é possível instanciar essa clase pois ela é
	 *  abstrata */
		
		
		acc2.withdraw(100.0);
	//	acc3.withdraw(100.0);
		
	/*  Downcasting  */	
		if (bacc instanceof BusinessAccount) {
			BusinessAccount bacc2 = (BusinessAccount) acc;
			bacc2.deposit(100.0);
		}
		else {
			System.out.println("Não é do mesmo tipo.");
		}
		
		for (Account x : list) {
			x.deposit(10.0);
		}
	}
}