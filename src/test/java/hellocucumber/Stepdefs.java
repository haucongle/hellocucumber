package hellocucumber;

import cucumber.api.java8.En;
import io.cucumber.datatable.DataTable;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Stepdefs implements En {

    private String today;
    private String actualAnswer;
    private int budget = 0;
    private List<Integer> list;
    private int sum = 0;

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
        });

        Given("I have {int} \\{what} cucumber(s) in my belly/stomach", (Integer num) -> {
        });

        Given("a list of numbers", (DataTable dataTable) ->
                this.list = dataTable.asList(Integer.TYPE));

        When("I summarize them", () -> {
            sum = list.stream().reduce(0, Integer::sum);
        });

        Then("should I get {int}", (Integer sum) ->
                assertEquals(this.sum, sum.intValue()));

        Given("one thing", () -> {
        });

        Given("another thing", () -> {
        });

        Given("yet another thing", () -> {
        });

        When("I open my eyes", () -> {
        });

        Then("I should see something", () -> {
        });

        Then("I shouldn't see something else", () -> {
        });
    }
}

class IsItFriday {
    static String isItFriday(String today) {
        return today.equals("Friday") ? "TGIF" : "Nope";
    }
}