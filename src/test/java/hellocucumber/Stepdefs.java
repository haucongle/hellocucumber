package hellocucumber;

import cucumber.api.java8.En;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

        Given("I have {int} cucumber(s) in my belly/stomach", (Integer num) -> {
//            I have 42 {what} cucumbers in my belly
            throw new cucumber.api.PendingException();
        });

        Given("I have {int} \\{what} cucumber(s) in my belly/stomach", (Integer num) -> {
//            I have 42 {what} cucumbers in my belly
            throw new cucumber.api.PendingException();
        });
    }
}

class IsItFriday {
    static String isItFriday(String today) {
        return today.equals("Friday") ? "TGIF" : "Nope";
    }
}