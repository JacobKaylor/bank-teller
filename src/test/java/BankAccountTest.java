import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class BankAccountTest {
	@Test
	public void shouldInitiateAnItemObject() {
		BankAccount underTest = new BankAccount();
		assertNotNull(underTest);
	}
	@Test 
	public void shouldInitiateAnItemObjectWithAccountNumberTypeAndBalance() {
		BankAccount underTest = new BankAccount("","",0.0);
		assertNotNull(underTest);
	}
	@Test
	public void shouldReturnAccountNumberAs1234() {
		BankAccount underTest = new BankAccount("1234","",0.0);
		String check = underTest.getAccountNumber();
		assertEquals("1234",check);
	}
	@Test
	public void shouldReturnAccountNumberAs1235() {
		BankAccount underTest = new BankAccount("1235","",0.0);
		String check = underTest.getAccountNumber();
		assertEquals("1235",check);
	}
	@Test
	public void shouldReturnTypeAsChecking() {
		BankAccount underTest = new BankAccount("","Checking",0.0);
		String check = underTest.getType();
		assertEquals("Checking",check);
	}
	@Test
	public void shouldReturnTypeAsSavings() {
		BankAccount underTest = new BankAccount("","Savings",0.0);
		String check = underTest.getType();
		assertEquals("Savings",check);
	}
	@Test
	public void shouldReturnBalance() {
		BankAccount underTest = new BankAccount("","",0.0);
		double check = underTest.getBalance();
		assertEquals(0.0,check,.001);
	}
	@Test
	public void shouldReturnBalanceAs10() {
		BankAccount underTest = new BankAccount("","",10.0);
		double check = underTest.getBalance();
		assertEquals(10.0,check,.001);
	}

}
