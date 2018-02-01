import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;

import org.junit.Test;



public class BankTest {
	@Test
	public void shouldAddAccount() {
		//arrange
		Bank underTest = new Bank();
		BigDecimal balance = new BigDecimal("42.00");
		String type = "";
		String accountNumber = "1234";
		BankAccount account = new BankAccount(accountNumber,type,balance);
		//act
		underTest.add(account);
		//assert
		BankAccount retrieved = underTest.findAccount(accountNumber);
		assertEquals(account,retrieved);
	}
	@Test 
	public void shouldBeAbleToAddTwoAccounts(){
		Bank underTest = new Bank();
		String accountNumber1 = "12345";
		BankAccount account1 = new BankAccount(accountNumber1,"",BigDecimal.ZERO);
		underTest.add(account1);
		
		String accountNumber2 = "12346";
		BankAccount account2 = new BankAccount(accountNumber2,"",BigDecimal.ZERO);
		underTest.add(account2);
		
		BankAccount retrieved = underTest.findAccount(accountNumber1);
		assertEquals(account1, retrieved);
		
	}
}
