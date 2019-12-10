package factory_demo;

public abstract class BankAccounts {
	
	private String accountNo;
	private String bankName;
	private String accountName;
	private double balance;
	private int yearlyInterest;
	

	public BankAccounts(String bankName, int yearlyInterest) {
		this.bankName = bankName;
		this.yearlyInterest = yearlyInterest;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public double getBalance() {
		return balance;
	}
	public void changeBalance(double change) {
		if (this.balance + change >= 0 ) {
			this.balance = change;
		}
		
	}
	public int getYearlyInterest() {
		return yearlyInterest;
	}
	public void setYearlyInterest(int yearlyInterest) {
		if (yearlyInterest >= 0 && yearlyInterest <= 100) {
			this.yearlyInterest = yearlyInterest;
		}
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return "BankAccounts [accountNo=" + accountNo + ", bankName=" + bankName + ", accountName=" + accountName
				+ ", balance=" + balance + ", yearlyInterest=" + yearlyInterest + "]";
	}
}
