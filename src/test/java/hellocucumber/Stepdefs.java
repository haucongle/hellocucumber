package hellocucumber;

import cucumber.api.java8.En;

import static org.junit.Assert.*;

public class Stepdefs implements En {

    private int budget = 0;

    public Stepdefs() {
        Given("I have {int} in my wallet", (Integer money) -> budget = money);
        When("I buy milk with {int}", (Integer price) -> budget -= price);
        Then("I should have {int} in my wallet", (Integer finalBudget) ->
                assertEquals(budget, finalBudget.intValue()));
    }
}