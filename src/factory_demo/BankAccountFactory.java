package factory_demo;

public class BankAccountFactory {
	
	public static BankAccounts getAccount(Bank bank) {
		
		switch (bank) {
			case GRINGOTTS :
				return new Gringotts();
			case ETERNAL:
				return new BankOfEternalGreed();
			case INTERNATIONAL:
				return new TheInternational();
		}
		return null;
	}
}
