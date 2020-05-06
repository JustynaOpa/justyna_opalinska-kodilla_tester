package divisiblechecker;

import io.cucumber.java8.En;
import org.junit.Assert;

public class ItIsNumberSteps implements En {
    private int number;
    private String answer;

    public ItIsNumberSteps(){

        Given("the number is 3", () -> {
            this.number = 3;
        });

        Given("the number is 4", () -> {
            this.number = 4;
        });

        Given("the number is 5", () -> {
            this.number = 5;
        });

        Given("the number is 9", () -> {
            this.number = 9;
        });

        Given("the number is 10", () -> {
            this.number = 10;
        });

        Given("the number is 15", () -> {
            this.number = 15;
        });

        Given("the number is 17", () -> {
            this.number = 17;
        });

        Given("the number is 30", () -> {
            this.number = 30;
        });

        When("I check if number is divisible", () -> {
            DivisibleChecker divisibleChecker = new DivisibleChecker();
            this.answer = divisibleChecker.checkIfDivisible(this.number);
        });

        Then("I should be told {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }
}
