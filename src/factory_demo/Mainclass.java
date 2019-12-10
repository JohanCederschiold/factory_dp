package factory_demo;

import java.util.UUID;

public class Mainclass {

	public static void main(String[] args) {
		
		BankAccounts bankOne = BankAccountFactory.getAccount(Bank.GRINGOTTS);
		System.out.println(bankOne.getClass().getName());
		
		bankOne.setAccountName("Harry Potter");
		bankOne.setAccountNo(UUID.randomUUID().toString());
		bankOne.changeBalance(320);
		
		System.out.println(bankOne);
		
		BankAccounts bankTwo = BankAccountFactory.getAccount(Bank.ETERNAL);
		
		bankTwo.setAccountName("Donald J Trump");
		bankTwo.setAccountNo("ABC123");
		bankTwo.changeBalance(0.001);
		
		System.out.println(bankTwo);
		
		

	}

}
