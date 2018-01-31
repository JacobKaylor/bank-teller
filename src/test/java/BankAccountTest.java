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

}
