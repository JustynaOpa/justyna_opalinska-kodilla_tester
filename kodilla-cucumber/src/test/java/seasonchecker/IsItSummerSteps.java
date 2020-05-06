package seasonchecker;

import io.cucumber.java8.En;
import org.junit.Assert;

import java.time.MonthDay;

public class IsItSummerSteps implements En {
    private MonthDay today;
    private String answer;

    public IsItSummerSteps(){

        Given("today is last day of December", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.today = MonthDay.of(12,31);
        });

        Given("today is first day of August", () -> {
            this.today = MonthDay.of(9,1);
        });

        Given("today is 26th day of June", () -> {
            this.today = MonthDay.of(6,26);
        });

        Given("today is 4th day of January", () -> {
            this.today = MonthDay.of(1,4);
        });

        Given("today is 2nd day of March", () -> {
            this.today = MonthDay.of(3,2);
        });

        When("I ask whether it's Summer", () -> {
            // Write code here that turns the phrase above into concrete actions
            SeasonChecker seasonChecker = new SeasonChecker();
            this.answer = seasonChecker.checkIfSummer(this.today);
        });

        Then("I should be told {string}", (String string) -> {
            // Write code here that turns the phrase above into concrete actions
            Assert.assertEquals(string, this.answer);
        });

    }
}
