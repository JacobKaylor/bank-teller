import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Bank {
	

	private Map<String,BankAccount> accounts = new HashMap<>();
	 
	Set<String> accountNum = accounts.keySet();

	private BankAccount account;



	public void add(BankAccount account) {
		accounts.put(account.getNumber(), account);	
	}

	public BankAccount findAccount(String accountNumber) {
		
		return accounts.get(accountNumber);
	}



}
