import atm.ATM;
import org.junit.Test;

public class ATMTest {
    int amount2 = 126;

    @Test (expected = IllegalArgumentException.class)
    public void errorTest() {
        ATM atm1 = new ATM();
        atm1.process(126);
    }
}
