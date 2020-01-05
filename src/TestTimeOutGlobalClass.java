import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.hamcrest.CoreMatchers.is;

public class TestTimeOutGlobalClass {

	private static Bank bank;
	 
    @ClassRule
    public static Timeout globalTimeout = Timeout.seconds(10);
 
    @BeforeClass
    public static void init() {
        bank = new Bank(500000, 100);
    }
 
    @Test
    public void totalCashTest() throws InterruptedException {
        assertThat(10.0, is(bank.getTotalCash()));
    }
 
    @Test
    public void totalAccountsTest() throws InterruptedException {
        assertThat(100, is(bank.getTotalAccounts()));
    }

}
