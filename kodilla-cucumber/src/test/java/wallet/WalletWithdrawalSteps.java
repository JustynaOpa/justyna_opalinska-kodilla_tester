package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletWithdrawalSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Teller teller = new Teller(cashSlot);

    public WalletWithdrawalSteps() {

        Given("my wallet has been credited with $100", () -> {
            wallet.deposit(100);
            Assert.assertEquals(100, wallet.getBalance());
        });

        When("I withdraw $200", () -> {
            teller.withdraw(wallet,200);
        });

        Then("nothing should be dispensed", () -> {
            Assert.assertEquals("Operation Impossible",100, wallet.getBalance());
        });

        Then("I should be told that I have insufficient funds in my account", () -> {
            teller.notification("You have insufficient founds in your account");
        });

        Given("my account has been credited with $100", () -> {
           wallet.deposit(100);
           Assert.assertEquals(100, wallet.getBalance());
        });

        When("I check my balance", () -> {
            wallet.getBalance();
        });

        Then("I should see that my balance is $100", () -> {
            Assert.assertEquals(100, wallet.getBalance());
        });

    }
}
