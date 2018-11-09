package hellocucumber;

import cucumber.api.java8.En;

import static org.junit.Assert.assertEquals;

public class Stepdefs implements En {

    private String today;
    private String actualAnswer;
    private int budget = 0;

    public Stepdefs() {
        Given("I have {int} in my wallet", (Integer money) -> budget = money);
        When("I buy milk with {int}", (Integer price) -> budget -= price);
        Then("I should have {int} in my wallet", (Integer finalBudget) ->
                assertEquals(budget, finalBudget.intValue()));


        Given("today is {string}", (String today) -> this.today = today);
        When("I ask whether it's Friday yet", () ->
                this.actualAnswer = IsItFriday.isItFriday(today));
        Then("I should be told {string}", (String expectedAnswer) ->
                assertEquals(expectedAnswer, actualAnswer));
    }
}

class IsItFriday {
    static String isItFriday(String today) {
        return today.equals("Friday") ? "TGIF" : "Nope";
    }
}