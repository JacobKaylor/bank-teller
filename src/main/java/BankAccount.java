
public class BankAccount {
	private String AccountNumber;
	private String type;
	private double balance;
	
	public BankAccount() {
		
	}

	public BankAccount(String AccountNumber, String type, double balance) {
		this.AccountNumber = AccountNumber;
		this.type = type;
		this.balance = balance;
	}

	public String getAccountNumber() {
		
		return AccountNumber;
	}

	public String getType() {
		
		return type;
	}

	public double getBalance() {
		
		return balance;
	}

}
