package application;

import entities.Account;
import entities.BusinessAcount;
import entities.SavingsAccount;

public class Main {

	public static void main(String[] args) {
		
//		Classe Account é abstrata, não pode ser Instanciada
//		Account acc1 = new Account(1001,"Vini", 1000.0);
		Account acc2 = new SavingsAccount(1002, "Vini", 1000.0, 0.01);
	}

}
