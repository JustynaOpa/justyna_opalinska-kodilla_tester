package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();

    public WalletSteps(){
        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance",200, wallet.getBalance());
        });

        When("I request $30", () -> {
            Teller teller = new Teller(cashSlot);
            teller.withdraw(wallet, 30);

        });

        Then("$30 should be dispensed", () -> {
           Assert.assertEquals(30,cashSlot.getContents());
        });

        // Scenario 2 i 3
        Given("I have deposited $100 in my wallet", () -> {
            wallet.deposit(100);
            Assert.assertEquals("Incorrect", 100, wallet.getBalance());
        });

        When("I request $110", () -> {
            Teller teller = new Teller(cashSlot);
            teller.withdraw(wallet,110);
            teller.withdraw(wallet,99);
        });

        Then("Nothing should be dispensed, operation impossible", () -> {
            Teller teller = new Teller(cashSlot);
            Assert.assertEquals(0, teller.checkerValue());
            Assert.assertEquals(99, teller.checkerValue());
        });
    }
}
