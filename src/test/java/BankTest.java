import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class BankTest {
	@Test
	public void shouldInitiateBank() {
		Bank underTest = new Bank();
		assertNotNull(underTest);
	}
	@Test
	public void shouldAddAccount() {
		Bank underTest = new Bank();
		underTest.addAccount(new BankAccount("1111","",0.0));
		String check = underTest.getAccountNum();
		assertEquals("1111",check);
		
	}

	




}
